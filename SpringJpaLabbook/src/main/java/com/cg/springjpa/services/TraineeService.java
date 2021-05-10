package com.cg.springjpa.services;

import org.springframework.stereotype.Service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.springjpa.repository.TraineeJpaRepository;
import com.cg.springjpa.utils.TraineeUtils;

import com.cg.springjpa.entities.Trainee;
import com.cg.springjpa.model.TraineeModel;
import com.cg.springjpa.controller.TraineeNotFoundException;

import java.util.List;
@Service
public class TraineeService {
	@Autowired
	TraineeJpaRepository trepo;
	
	public List<TraineeModel> listAll(){
		List<Trainee> tlist=trepo.findAll();
		List<TraineeModel> tmlist=TraineeUtils.convertToModelList(tlist);
		return tmlist;
		
	}
	public TraineeModel ListById(int id) throws TraineeNotFoundException {
		Optional<Trainee> optional=trepo.findById(id);
		if(optional.isPresent())
		{
			Trainee product=optional.get();
			return  TraineeUtils.convertToTraineeModel(product);
		}
		else {
			throw new TraineeNotFoundException("Trainee not found ");
		}
	}
	
	public void deleteTrainee(TraineeModel traineemodel) {
		trepo.delete(TraineeUtils.convertToEntity(traineemodel));
		
	}
	

	
	public void updateTrainee(TraineeModel traineemodel) {
		trepo.save(TraineeUtils.convertToEntity(traineemodel));
		
	}
	public void addTrainee(TraineeModel traineemodel) {
		System.out.println("**********************elements added**********************");
	 trepo.saveAndFlush(TraineeUtils.convertToEntity(traineemodel));
	}
	
	public TraineeModel findTraineeByName(String traineeName) {
	Trainee tlist=trepo.findByTraineeName(traineeName);
	TraineeModel tmlist=TraineeUtils.convertToTraineeModel(tlist);
		return tmlist;
		
	}
	
	
	
	 
}

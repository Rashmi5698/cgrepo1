package com.cg.springjpa.controller;
import org.springframework.web.bind.annotation.RestController;
import com.cg.springjpa.services.TraineeService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;


import com.cg.springjpa.entities.Trainee;
import com.cg.springjpa.model.TraineeModel;
import java.util.List;
import com.cg.springjpa.utils.TraineeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.springjpa.services.TraineeService;

@RestController
public class TraineeController {
	@Autowired
	TraineeService tservice;
	
	@GetMapping(value="trainee")
	public ResponseEntity getTraineeDetails() {
		List<TraineeModel> tr=tservice.listAll();
		ResponseEntity response = new ResponseEntity(tr, HttpStatus.OK);
		return response;
		}
	@GetMapping(value="trainee/{id}")
	public ResponseEntity getTraineebyId(@PathVariable("id")int id) throws TraineeNotFoundException{//, @PathVariable("pname") String name) {
//System.out.println("name "+name);
		TraineeModel p=tservice.ListById(id);
		return new ResponseEntity(p, HttpStatus.OK);
	}
	
	
	@PostMapping(value="trainee")
	public ResponseEntity addTraineeDetails(@RequestBody TraineeModel traineemodel) {
		tservice.addTrainee(traineemodel);
		return new ResponseEntity("trainee added successfully", HttpStatus.OK);
		}
	
	@PutMapping(value="trainee")
	public ResponseEntity UpdateTraineeDetails(@RequestBody TraineeModel traineemodel) {
		tservice.updateTrainee(traineemodel);
		return new ResponseEntity("trainee aupdated successfully", HttpStatus.OK);
		}
	
	@DeleteMapping(value="trainee")
	public ResponseEntity DeleteTraineeDetails(@RequestBody TraineeModel traineemodel) {
		tservice.deleteTrainee(traineemodel);
		return new ResponseEntity("trainee deleted successfully", HttpStatus.OK);
		}
	
	@GetMapping(value="trainee/{traineeName}")
	public ResponseEntity getTraineeByName(@PathVariable("traineeName")String traineeName) {
		TraineeModel p=tservice.findTraineeByName(traineeName);
		return new ResponseEntity(p, HttpStatus.OK);
		
	}
}
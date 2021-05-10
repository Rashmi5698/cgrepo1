package com.cg.springjpa.utils;
import com.cg.springjpa.entities.Trainee;
import com.cg.springjpa.model.TraineeModel;
import java.util.ArrayList;
import java.util.List;
public class TraineeUtils {
	public static Trainee convertToEntity(TraineeModel trainemodel) {
		Trainee trainee=new Trainee();
		trainee.setTraineeId(trainemodel.getTraineeId());
		trainee.setTraineeName(trainemodel.getTraineeName());
		trainee.setTraineeDomain(trainemodel.getTraineeDomain());
		trainee.setTraineeLocation(trainemodel.getTraineeLocation());
		return trainee;
	}
	
	public static List<TraineeModel> convertToModelList(List<Trainee> list){
		List<TraineeModel> tmodel=new ArrayList<TraineeModel>();
		for(Trainee trainee:list)
			tmodel.add(convertToTraineeModel(trainee));
		return tmodel;
			
		
	}
	public static TraineeModel convertToTraineeModel(Trainee trainee) {
		TraineeModel trainemodel=new TraineeModel();
		trainemodel.setTraineeId(trainee.getTraineeId());
		trainemodel.setTraineeName(trainee.getTraineeName());
		trainemodel.setTraineeDomain(trainee.getTraineeDomain());
		trainemodel.setTraineeLocation(trainee.getTraineeLocation());
		return trainemodel;
		
	}

}

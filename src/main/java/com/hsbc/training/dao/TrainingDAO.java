package com.hsbc.training.dao;

import com.hsbc.training.models.Training;
import com.hsbc.training.models.Training.TrainingAlreadyExistsException;
import com.hsbc.training.models.Training.TrainingNotFoundException;

public interface TrainingDAO {
	
	//declaring the addTraining method with the throw for exception if the training course already exist or not
	void addTraining(Training training) throws TrainingAlreadyExistsException;
    Training getTrainingById(int id) throws TrainingNotFoundException;
    //methods pending

}

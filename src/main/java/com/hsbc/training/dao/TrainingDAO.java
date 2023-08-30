package com.hsbc.training.dao;

import com.hsbc.training.models.Training;
import com.hsbc.training.models.Training.TrainingAlreadyExistsException;
import com.hsbc.training.models.Training.TrainingNotFoundException;

public interface TrainingDAO {
	
	void addTraining(Training training) throws TrainingAlreadyExistsException;
    Training getTrainingById(int id) throws TrainingNotFoundException;
    //methods pending

}

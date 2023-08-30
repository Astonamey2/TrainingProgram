package com.hsbc.training.bl;

import com.hsbc.training.dao.TrainingDAO;
import com.hsbc.training.models.Training;
import com.hsbc.training.models.Training.TrainingAlreadyExistsException;
import com.hsbc.training.models.Training.TrainingNotFoundException;

public class TrainingServiceImpl implements TrainingService{
	
	private TrainingDAO trainingDAO;

    public TrainingServiceImpl(TrainingDAO trainingDAO) {
        this.trainingDAO = trainingDAO;
    }

    @Override
    public void createTraining(Training training) throws TrainingAlreadyExistsException {
        trainingDAO.addTraining(training);
    }

    @Override
    public Training getTrainingById(int id) throws TrainingNotFoundException {
        return trainingDAO.getTrainingById(id);
    }


}

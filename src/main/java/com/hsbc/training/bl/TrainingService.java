package com.hsbc.training.bl;

import com.hsbc.training.dao.TrainingDAO;
import com.hsbc.training.models.Employee;
import com.hsbc.training.models.Training;
import com.hsbc.training.models.Training.TrainingAlreadyExistsException;
import com.hsbc.training.models.Training.TrainingNotFoundException;

public interface TrainingService {
	
	private TrainingDAO trainingDAO;

    public static void createTraining(Training training) throws TrainingAlreadyExistsException {
        // we need to check if the training already exists in the DAO
        // If not, create the training =method
    }	

    public static Training getTrainingById(int trainingId) {
        return trainingDAO.getTrainingById(trainingId);
    }

    public static void registerEmployeeForTraining(int employeeId, int trainingId) throws TrainingNotFoundException {
        Employee employee = EmployeeService.getEmployeeById(employeeId);
        if (employee == null) {
            throw new EmployeeNotFoundException("Employee not found.");
        }

        Training training = trainingService.getTrainingById(trainingId);
        if (training == null) {
            throw new TrainingNotFoundException("Training not found.");
        }

        // Register the employee for the training	
    }


}

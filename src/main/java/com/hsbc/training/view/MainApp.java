package com.hsbc.training.view;

import java.util.Date;

import com.hsbc.training.bl.EmployeeService;
import com.hsbc.training.bl.TrainingService;
import com.hsbc.training.dao.EmployeeDAO;
import com.hsbc.training.dao.TrainingDAO;
import com.hsbc.training.models.Employee;
import com.hsbc.training.models.Training;
import com.hsbc.training.models.Training.EmployeeAlreadyExistsException;
import com.hsbc.training.models.Training.TrainingAlreadyExistsException;

public class MainApp {
	    public static void main(String[] args) {
	        EmployeeDAO employeeDAO = new EmployeeDAO();
	        EmployeeService employeeService = new EmployeeService(employeeDAO);

	        TrainingDAO trainingDAO = new TrainingDAO();
	        TrainingService trainingService = new TrainingService(trainingDAO);

	        // Create an Employee
	        Employee employee = new Employee(1, "Amey Somatkar");
	        try {
	            employeeService.createEmployee(employee);
	        } catch (EmployeeAlreadyExistsException e) {
	            System.out.println(e.getMessage());
	        }

	        // Create a Training
	        Training training = new Training(1, "Java Basics", "Java Programming", new Date(), new Date(), 60);
	        try {
	            trainingService.createTraining(training);
	        } catch (TrainingAlreadyExistsException e) {
	            System.out.println(e.getMessage());
	        }

	        // Register an Employee for Training (Implement this logic)
	        // Handle exceptions for Employee not found and Training not found here
	    }
	}




package com.hsbc.training.dao;

import com.hsbc.training.models.Employee;
import com.hsbc.training.models.Training.EmployeeAlreadyExistsException;

public interface EmployeeDAO {
	
	//declaring the addemployee method with the throw for exception if the employee already exist or not
	void addEmployye(Employee employee) throws EmployeeAlreadyExistsException;
	
	//calling the method to find the employee by the 'id'
	Employee getEmployeeById(int id);
	
}

package com.hsbc.training.dao;

import com.hsbc.training.models.Employee;
import com.hsbc.training.models.Training.EmployeeAlreadyExistsException;

public interface EmployeeDAO {
	
	void addEmployye(Employee employee) throws EmployeeAlreadyExistsException;
	Employee getEmployeeById(int id);
	//methods pending
}

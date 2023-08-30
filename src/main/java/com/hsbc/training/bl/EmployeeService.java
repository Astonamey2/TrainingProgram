package com.hsbc.training.bl;

import com.hsbc.training.dao.EmployeeDAO;
import com.hsbc.training.models.Employee;
import com.hsbc.training.models.Training.EmployeeAlreadyExistsException;

public class EmployeeService {
	
	 private EmployeeDAO employeeDAO;

	    public void createEmployee(Employee employee) throws EmployeeAlreadyExistsException {
	        // Check if the employee already exists in the DAO
	        // If not, create the employee
	    }

	    public Employee getEmployeeById(int employeeId) {


	        return employeeDAO.getEmployeeById(employeeId);

	    }

}

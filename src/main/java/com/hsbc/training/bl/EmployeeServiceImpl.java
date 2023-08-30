package com.hsbc.training.bl;

import com.hsbc.training.dao.EmployeeDAO;
import com.hsbc.training.models.Employee;
import com.hsbc.training.models.Training.EmployeeAlreadyExistsException;

public class EmployeeServiceImpl implements EmployeeService {
	    private EmployeeDAO employeeDAO;

	    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
	        this.employeeDAO = employeeDAO;
	    }

	    @Override
	    public void createEmployee(Employee employee) throws EmployeeAlreadyExistsException {
	        employeeDAO.addEmployee(employee);
	    }

	    @Override
	    public Employee getEmployeeById(int id) {
	        return employeeDAO.getEmployeeById(id);
	    }

	    // methods pending
	}



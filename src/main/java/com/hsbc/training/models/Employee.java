package com.hsbc.training.models;

//creating model class Employee entity
public class Employee {

		//declaring the data members for id and name of the employee
	    private int id;
	    private String name;
	    
		//the getter and setter method for 'id'
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		//the getter and setter method for 'name'
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		//parameterized constructor with arguments as id and name
		public Employee(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}  

	    
	

}

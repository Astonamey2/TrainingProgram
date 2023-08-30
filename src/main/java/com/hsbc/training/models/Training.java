package com.hsbc.training.models;

import java.util.Date;

public class Training {
	
	
	    private int id;
	    private String name;
	    private String skills;
	    private Date startDate;
	    private Date endDate;
	    private int labDurationInMinutes;
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSkills() {
			return skills;
		}
		public void setSkills(String skills) {
			this.skills = skills;
		}
		public Date getStartDate() {
			return startDate;
		}
		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
		public Date getEndDate() {
			return endDate;
		}
		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}
		public int getLabDurationInMinutes() {
			return labDurationInMinutes;
		}
		public void setLabDurationInMinutes(int labDurationInMinutes) {
			this.labDurationInMinutes = labDurationInMinutes;
		}
		
		
		public Training(int id, String name, String skills, Date startDate, Date endDate, int labDurationInMinutes) {
			super();
			this.id = id;
			this.name = name;
			this.skills = skills;
			this.startDate = startDate;
			this.endDate = endDate;
			this.labDurationInMinutes = labDurationInMinutes;
		}
		
		// Custom exceptions
		public class EmployeeAlreadyExistsException extends Exception {
		    public EmployeeAlreadyExistsException(String message) {
		        super(message);
		    }
		}

		public class TrainingAlreadyExistsException extends Exception {
		    public TrainingAlreadyExistsException(String message) {
		        super(message);
		    }
		}

		public class TrainingNotFoundException extends Exception {
		    public TrainingNotFoundException(String message) {
		        super(message);
		    }
		}

	    
		
	    

	    
	}



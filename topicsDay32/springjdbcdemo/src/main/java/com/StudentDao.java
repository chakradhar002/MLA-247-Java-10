package com;

import javax.sql.DataSource;

public interface StudentDao {

	 /** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	   */
	   public void setDataSource(DataSource ds);
	   /** 
	    * This is the method to be used to create
	    * a record in the Student table.
	   */
	   public void addStudentRecord(String name, Integer age);
}

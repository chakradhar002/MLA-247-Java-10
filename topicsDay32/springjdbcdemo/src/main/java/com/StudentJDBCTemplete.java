package com;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplete implements StudentDao {
	// this variable is given by spring
	private DataSource DataSource;
	private JdbcTemplate jdbcTemplateObj;

	@Override
	public void setDataSource(DataSource ds) {

		this.DataSource = ds;
		this.jdbcTemplateObj = new JdbcTemplate(DataSource);

	}

	@Override
	public void addStudentRecord(String name, Integer age) {
		String sql = "insert into student(name,age) value(?,?)";

		jdbcTemplateObj.update(sql, name, age);
		System.out.println("created student record" + name + "" + age);
		return;
	}
	//  // get list of all students
	  // delete
	

}

package springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.entity.Employee;
import springboot.repositary.EmployeeRepositary;

@Service
public class EmployeeServcie {
	/// bind the dependency of repo into service class
	@Autowired
	public EmployeeRepositary employeeRepositary;

	// create the employee info

	public Employee addEmployeeRecord(Employee employee) {

		Employee result = employeeRepositary.save(employee);

		return result;

	}

}

package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.entity.Employee;
import springboot.service.EmployeeServcie;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	// field from service class
	@Autowired
	EmployeeServcie employeeServcie;

	@PostMapping("/create")
	Employee AddEmpRecord(@RequestBody Employee emp) {

		// this method is from service classs
		Employee result = employeeServcie.addEmployeeRecord(emp);

		return result;

	}

}

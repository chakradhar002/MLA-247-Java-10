package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import springboot.entity.Employee;
import springboot.service.EmployeeServcie;

@RestController
@RequestMapping("/employee")
@Tag(name = "User API", description = "API for managing users")
public class EmployeeController {

	// field from service class
	
	@Autowired
	EmployeeServcie employeeServcie;

	@Operation(summary = "Create a new user", description = "Adds a new user to the system")
	@PostMapping("/create")
	Employee AddEmpRecord(@RequestBody Employee emp) {

		// this method is from service classs
		Employee result = employeeServcie.addEmployeeRecord(emp);

		return result;

	}

}

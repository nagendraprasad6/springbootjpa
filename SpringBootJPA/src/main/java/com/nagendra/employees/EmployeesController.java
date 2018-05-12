package com.nagendra.employees;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.GET, value="/employees")
	public List<Employee> getEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping("/employees/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable String id){
		return employeeService.getEmployeeById(id);
	}
	
	@RequestMapping("/employee/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name){
		return employeeService.getEmployeeByName(name);
	}
	
	@RequestMapping("/employeetech/{tech}")
	public List<Employee> getEmployeeByTech(@PathVariable String tech){
		return employeeService.getEmployeeByTech(tech);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employees")
	public void addEmployee(@Valid @RequestBody Employee employee){
		employeeService.addEmployee(employee);
	}
	
	@PutMapping("employees")
	public void updateEmployee(@Valid @RequestBody Employee employee){
		employeeService.addEmployee(employee);
	}
	
	@DeleteMapping("employees/{id}")
	public void deleteEmployee(@PathVariable String id){
		employeeService.deleteEmployee(id);	
	}
}

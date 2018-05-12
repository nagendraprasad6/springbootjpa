package com.nagendra.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRespository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}
	
	public void addEmployee(Employee employee){
		employeeRepository.save(employee);
	}
	
	public Optional<Employee> getEmployeeById(String id){
		return employeeRepository.findById(id);
	}
	
	public void updateEmployee(String id, Employee employee){
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(String id){
		employeeRepository.deleteById(id);
	}

	public List<Employee> getEmployeeByName(String name) {
		return employeeRepository.getEmployeeByName(name);
	}

	public List<Employee> getEmployeeByTech(String tech) {
		return employeeRepository.getEmployeeByTech(tech);
	}
}

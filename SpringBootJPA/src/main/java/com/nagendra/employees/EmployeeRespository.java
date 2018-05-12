package com.nagendra.employees;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRespository extends CrudRepository<Employee, String> {
	public List<Employee> getEmployeeByName(String name);
	public List<Employee> getEmployeeByTech(String tech);
}

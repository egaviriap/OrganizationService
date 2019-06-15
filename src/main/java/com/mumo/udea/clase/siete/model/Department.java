package com.mumo.udea.clase.siete.model;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private Long id;
	private String name;
	private List<Employee> employees = new ArrayList<>();

	public Department(String name) {
		super();
		this.name = name;
	}

	public Department(Long id, String name, List<Employee> employees) {
		super();
		this.id = id;
		this.name = name;
		this.employees = employees;
	}

	public Department() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}

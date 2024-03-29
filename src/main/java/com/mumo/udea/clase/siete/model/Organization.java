package com.mumo.udea.clase.siete.model;

import java.util.ArrayList;
import java.util.List;

public class Organization {

	private Long id;
	private String name;
	private String address;
	private List<Department> departments = new ArrayList<>();
	private List<Employee> employees = new ArrayList<>();

	public Organization(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public Organization(Long id, String name, String address, List<Department> departments, List<Employee> employees) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.departments = departments;
		this.employees = employees;
	}

	public Organization() {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}

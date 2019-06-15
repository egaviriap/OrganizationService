package com.mumo.udea.clase.siete.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mumo.udea.clase.siete.client.DepartmentClient;
import com.mumo.udea.clase.siete.client.EmployeeClient;
import com.mumo.udea.clase.siete.model.Organization;
import com.mumo.udea.clase.siete.repository.OrganizationRepository;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {
	
	Logger log = LoggerFactory.getLogger(OrganizationController.class);

	@Autowired
	OrganizationRepository repository;
	@Autowired
	DepartmentClient departmentClient;
	@Autowired
	EmployeeClient employeeClient;
	
	@PostMapping
	public Organization add(@RequestBody Organization organization) {
		log.info("Organization add: {}", organization);
		return repository.add(organization);
	}
	
	@GetMapping
	public List<Organization> findAll() {
		log.info("Organization find");
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Organization findById(@PathVariable("id") Long id) {
		log.info("Organization find: id={}", id);
		return repository.findById(id);
	}

	@GetMapping("/{id}/with-departments")
	public Organization findByIdWithDepartments(@PathVariable("id") Long id) {
		log.info("Organization find: id={}", id);
		Organization organization = repository.findById(id);
		organization.setDepartments(departmentClient.findByOrganization(organization.getId()));
		return organization;
	}
	
	@GetMapping("/{id}/with-departments-and-employees")
	public Organization findByIdWithDepartmentsAndEmployees(@PathVariable("id") Long id) {
		log.info("Organization find: id={}", id);
		Organization organization = repository.findById(id);
		organization.setDepartments(departmentClient.findByOrganizationWithEmployees(organization.getId()));
		return organization;
	}
	
	@GetMapping("/{id}/with-employees")
	public Organization findByIdWithEmployees(@PathVariable("id") Long id) {
		log.info("Organization find: id={}", id);
		Organization organization = repository.findById(id);
		organization.setEmployees(employeeClient.findByOrganization(organization.getId()));
		return organization;
	}
}

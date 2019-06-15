package com.mumo.udea.clase.siete.repository;

import java.util.List;

import com.mumo.udea.clase.siete.model.Organization;

public interface OrganizationRepository {

public Organization add(Organization organization) ;
	
	public Organization findById(Long id) ;
	
	public List<Organization> findAll() ;
}

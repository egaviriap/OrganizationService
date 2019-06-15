package com.mumo.udea.clase.siete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.mumo.udea.clase.siete.model.Organization;
import com.mumo.udea.clase.siete.repository.OrganizationRepository;
import com.mumo.udea.clase.siete.repository.OrganizationRepositoryImpl;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class OrganizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationApplication.class, args);
	}
	
	@Bean
	OrganizationRepository repository() {
		OrganizationRepository repository = new OrganizationRepositoryImpl();
		repository.add(new Organization("Microsoft", "Redmond, Washington, USA"));
		repository.add(new Organization("Oracle", "Redwood City, California, USA"));	
		return repository;
	}

}

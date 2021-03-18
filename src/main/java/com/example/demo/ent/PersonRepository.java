package com.example.demo.ent;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
@RepositoryRestResource
public interface PersonRepository extends JpaRepository<Person, Long>{
	@Query("select p from Person p")
public String[] find();
	/* @RestResource( path = "/srchDesign" )
	public List<Person> findByNom();*/
	 
}

package com.example.crudRestAPI.repositories;

import com.example.crudRestAPI.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestResource
public interface CarRestRepository extends JpaRepository<Car, Long> {
}

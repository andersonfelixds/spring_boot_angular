package br.com.project.api.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.project.api.models.Customer;

public interface Repository extends CrudRepository<Customer, Long>{
    
}

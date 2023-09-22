package com.exampleapi.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.exampleapi.model.entity.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Integer>{
    
}

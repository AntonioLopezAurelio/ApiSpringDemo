package com.exampleapi.service;

import com.exampleapi.model.entity.Cliente;

public interface ICliente {
    
    Cliente save(Cliente cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);
}

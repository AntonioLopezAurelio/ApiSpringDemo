package com.exampleapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exampleapi.model.dao.ClienteDao;
import com.exampleapi.model.entity.Cliente;
import com.exampleapi.service.ICliente;

@Service
public class ClienteImple implements ICliente {

    @Autowired
    private ClienteDao clienteDao;

    @Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
        
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }
    
}

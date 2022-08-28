package com.guarda_objetos.sistema_controle_guarda_objetos.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import com.guarda_objetos.sistema_controle_guarda_objetos.dto.ClientesDto;
import com.guarda_objetos.sistema_controle_guarda_objetos.model.Clientes;
import com.guarda_objetos.sistema_controle_guarda_objetos.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    public List<Clientes> getAll(){
        return clientesRepository.findAll();

    }



}

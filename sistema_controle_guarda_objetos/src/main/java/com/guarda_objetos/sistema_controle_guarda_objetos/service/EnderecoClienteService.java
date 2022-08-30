package com.guarda_objetos.sistema_controle_guarda_objetos.service;

import com.guarda_objetos.sistema_controle_guarda_objetos.model.EnderecoCliente;
import com.guarda_objetos.sistema_controle_guarda_objetos.repository.EnderecoClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EnderecoClienteService {

    @Autowired
    private EnderecoClienteRepository enderecoClienteRepository;

    @Transactional
    public EnderecoCliente create(EnderecoCliente enderecoCliente) {
        return enderecoClienteRepository.save(enderecoCliente);
    }

    public List<EnderecoCliente> findAll() {
        return enderecoClienteRepository.findAll();
    }

    public Optional<EnderecoCliente> findById(String cpfCliente) {
        return enderecoClienteRepository.findById(cpfCliente);
    }

    @Transactional
    public void delete(EnderecoCliente enderecoCliente) {
        enderecoClienteRepository.delete(enderecoCliente);
    }
}

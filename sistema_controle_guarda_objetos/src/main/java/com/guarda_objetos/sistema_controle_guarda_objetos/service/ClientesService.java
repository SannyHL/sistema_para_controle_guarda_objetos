package com.guarda_objetos.sistema_controle_guarda_objetos.service;

import com.guarda_objetos.sistema_controle_guarda_objetos.model.Clientes;
import com.guarda_objetos.sistema_controle_guarda_objetos.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

   @Transactional
    public Clientes create(Clientes clientes) {
       return clientesRepository.save(clientes);
    };

    public List<Clientes> findAll() {
        return clientesRepository.findAll();
    }

    public Optional<Clientes> pegarCPF(String cpfCliente) {
        return clientesRepository.findById(cpfCliente);
    }

    @Transactional
    public void deletar(Clientes clientes) {
        clientesRepository.delete(clientes);
    }

}

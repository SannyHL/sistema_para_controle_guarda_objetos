package com.guarda_objetos.sistema_controle_guarda_objetos.service;

import com.guarda_objetos.sistema_controle_guarda_objetos.model.ObjetoArmazenado;
import com.guarda_objetos.sistema_controle_guarda_objetos.repository.ObjetoArmazenadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ObjetoArmazenadoService {

    @Autowired
    private ObjetoArmazenadoRepository objetoArmazenadoRepository;

    @Transactional
    public ObjetoArmazenado create(ObjetoArmazenado obejetoArmazenado) {
        return objetoArmazenadoRepository.save(obejetoArmazenado);
    }


    public List<ObjetoArmazenado> findAll() {
        return objetoArmazenadoRepository.findAll();
    }

    public Optional<ObjetoArmazenado> findCpf(String cpfCliente) {
        return objetoArmazenadoRepository.findById(cpfCliente);
    }

    @Transactional
    public void deletar(ObjetoArmazenado objetoArmazenado) {
        objetoArmazenadoRepository.delete(objetoArmazenado);
    }
}



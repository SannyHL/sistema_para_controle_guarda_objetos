package com.guarda_objetos.sistema_controle_guarda_objetos.service;

import com.guarda_objetos.sistema_controle_guarda_objetos.repository.ObjetoArmazenadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObjetoArmazenadoService {

    @Autowired
    private ObjetoArmazenadoRepository objetoArmazenadoRepository;
}

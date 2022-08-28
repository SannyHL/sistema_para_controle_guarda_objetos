package com.guarda_objetos.sistema_controle_guarda_objetos.controller;

import com.guarda_objetos.sistema_controle_guarda_objetos.service.ObjetoArmazenadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping("/objetos")
public class ObjetoArmazenadoController {

    @Autowired
    private ObjetoArmazenadoService objetoArmazenadoService;


}

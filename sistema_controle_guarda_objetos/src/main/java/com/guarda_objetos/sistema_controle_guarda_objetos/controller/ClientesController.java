package com.guarda_objetos.sistema_controle_guarda_objetos.controller;


import com.guarda_objetos.sistema_controle_guarda_objetos.dto.ClientesDto;
import com.guarda_objetos.sistema_controle_guarda_objetos.model.Clientes;
import com.guarda_objetos.sistema_controle_guarda_objetos.service.ClientesService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.ZoneId;

@RestController
@ResponseBody
@CrossOrigin("*")
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping
    public ResponseEntity<Clientes> criaCliente(@RequestBody @Valid ClientesDto clientesDto){
        var clientes = new Clientes();
        BeanUtils.copyProperties(clientesDto, clientes);
        clientes.setDataRegistro(LocalDate.now(ZoneId.of("UTC")));
        return new ResponseEntity<>(clientesService.create(clientes), HttpStatus.CREATED);

    }
}

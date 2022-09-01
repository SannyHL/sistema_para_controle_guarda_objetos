package com.guarda_objetos.sistema_controle_guarda_objetos.controller;


import com.guarda_objetos.sistema_controle_guarda_objetos.dto.EnderecoClienteDto;
import com.guarda_objetos.sistema_controle_guarda_objetos.model.EnderecoCliente;
import com.guarda_objetos.sistema_controle_guarda_objetos.service.EnderecoClienteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

@RestController
@ResponseBody
@CrossOrigin("*")
@RequestMapping("/enderecos")
public class EnderecoClienteController {

    @Autowired
    private EnderecoClienteService enderecoClienteService;

    @PostMapping("/")
    public ResponseEntity<EnderecoCliente> criarEndereco(@RequestBody @Valid EnderecoClienteDto enderecoClienteDto){
       var enderecoCliente = new EnderecoCliente();
        BeanUtils.copyProperties(enderecoClienteDto, enderecoCliente);
        return new ResponseEntity<>(enderecoClienteService.create(enderecoCliente), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<EnderecoCliente>> getAll(){
        return new ResponseEntity<>(enderecoClienteService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{cep}")
    public ResponseEntity<EnderecoCliente> getCep(@PathVariable(value = "cep") String cep){
        Optional<EnderecoCliente> enderecoClienteOptional = enderecoClienteService.findById(cep);
        if (enderecoClienteOptional.isPresent()){
            return new ResponseEntity<>(enderecoClienteOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{cep}")
    public ResponseEntity<EnderecoCliente> deletarEndereco(@PathVariable(value = "cep") String cep){
        Optional<EnderecoCliente> enderecoClienteOptional = enderecoClienteService.findById(cep);
        if(enderecoClienteOptional.isPresent()){
            enderecoClienteService.delete(enderecoClienteOptional.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{cep}")
    public ResponseEntity<EnderecoCliente> atualizarEndereco(@PathVariable(value = "cep") String cep, @RequestBody @Valid EnderecoClienteDto enderecoClienteDto){
        Optional<EnderecoCliente> enderecoClienteOptional = enderecoClienteService.findById(cep);
        if(enderecoClienteOptional.isPresent()){
            var enderecoCliente = new EnderecoCliente();
            BeanUtils.copyProperties(enderecoClienteDto, enderecoCliente);
            return new ResponseEntity<>(enderecoClienteService.create(enderecoCliente), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}

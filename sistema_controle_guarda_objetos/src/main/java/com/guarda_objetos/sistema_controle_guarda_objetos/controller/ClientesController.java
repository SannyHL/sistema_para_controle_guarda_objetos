package com.guarda_objetos.sistema_controle_guarda_objetos.controller;


import com.guarda_objetos.sistema_controle_guarda_objetos.dto.ClientesDto;
import com.guarda_objetos.sistema_controle_guarda_objetos.model.Clientes;
import com.guarda_objetos.sistema_controle_guarda_objetos.service.ClientesService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;
import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @GetMapping("/cadastrar")
    public String cadastro(){
        return "cadastrarClientes";
    }
    @PostMapping("/cadastrar")
    public ResponseEntity<Clientes> criaClienteNavegador( @Valid ClientesDto clientesDto){
        var clientes = new Clientes();
        BeanUtils.copyProperties(clientesDto, clientes);
        clientes.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        System.out.println("Entrei");
        return new ResponseEntity<>(clientesService.create(clientes), HttpStatus.CREATED);

    }

    @GetMapping("/")
    public ResponseEntity<List<Clientes>> getAll(){
        return new ResponseEntity<>(clientesService.findAll(), HttpStatus.OK);
    }


    @PostMapping("/")
    public ResponseEntity<Clientes> criaCliente(@RequestBody @Valid ClientesDto clientesDto){
        var clientes = new Clientes();
        BeanUtils.copyProperties(clientesDto, clientes);
        clientes.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        System.out.println("Entrei");
        return new ResponseEntity<>(clientesService.create(clientes), HttpStatus.CREATED);

    }

    @GetMapping("/{cpfCliente}")
    public ResponseEntity<Clientes> pegarCpf(@PathVariable(value = "cpfCliente") String cpfCliente){
        Optional<Clientes> clientesOptional = clientesService.pegarCPF(cpfCliente);
        if(clientesOptional.isPresent()){
            return new ResponseEntity<>(clientesOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{cpfCliente}")
    public ResponseEntity<Clientes> deletarCliente(@PathVariable(value = "cpfCliente") String cpfCliente){
        Optional<Clientes> clientesOptional = clientesService.pegarCPF(cpfCliente);
        if(clientesOptional.isPresent()){
            clientesService.deletar(clientesOptional.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{cpfCliente}")
    public ResponseEntity<Clientes> atualizarCliente(@PathVariable(value = "cpfCliente") String cpfCliente, @RequestBody @Valid ClientesDto clientesDto){
        Optional<Clientes> clientesOptional = clientesService.pegarCPF(cpfCliente);
        if (clientesOptional.isPresent()){
            var clientes = new Clientes();
            BeanUtils.copyProperties(clientesDto, clientes);
            clientes.setDataRegistro(clientesOptional.get().getDataRegistro());
            return new ResponseEntity<>(clientesService.create(clientes), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

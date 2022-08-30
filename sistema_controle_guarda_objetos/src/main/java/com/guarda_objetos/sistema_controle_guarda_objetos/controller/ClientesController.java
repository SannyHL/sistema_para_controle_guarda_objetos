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
import java.util.List;
import java.util.Optional;

@RestController
@ResponseBody
@CrossOrigin("*")
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping("/")
    public ResponseEntity<Clientes> criaCliente(@RequestBody @Valid ClientesDto clientesDto){
        var clientes = new Clientes();
        BeanUtils.copyProperties(clientesDto, clientes);
        clientes.setDataRegistro(LocalDate.now(ZoneId.of("UTC")));
        return new ResponseEntity<>(clientesService.create(clientes), HttpStatus.CREATED);

    }

    @GetMapping("/")
    public ResponseEntity<List<Clientes>> pegarDados(){
        return new ResponseEntity<>(clientesService.findAll(), HttpStatus.OK);
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

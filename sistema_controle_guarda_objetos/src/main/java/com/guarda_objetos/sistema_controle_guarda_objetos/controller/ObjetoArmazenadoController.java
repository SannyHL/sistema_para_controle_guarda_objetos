package com.guarda_objetos.sistema_controle_guarda_objetos.controller;

import com.guarda_objetos.sistema_controle_guarda_objetos.dto.ObjetoArmazenadoDto;
import com.guarda_objetos.sistema_controle_guarda_objetos.model.ObjetoArmazenado;
import com.guarda_objetos.sistema_controle_guarda_objetos.service.ObjetoArmazenadoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@ResponseBody
@CrossOrigin("*")
@RequestMapping("/objetos")
public class ObjetoArmazenadoController {

    @Autowired
    private ObjetoArmazenadoService objetoArmazenadoService;

    @PostMapping("/")
    public ResponseEntity<ObjetoArmazenado> criarObjeto(@RequestBody @Valid ObjetoArmazenadoDto objetoArmazenadoDto){
        var obejetoArmazenado = new ObjetoArmazenado();
        BeanUtils.copyProperties(objetoArmazenadoDto, obejetoArmazenado);
        return new ResponseEntity<>(objetoArmazenadoService.create(obejetoArmazenado), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<ObjetoArmazenado>> getAll(){
        return new ResponseEntity<>(objetoArmazenadoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{cpfCliente}")
    public ResponseEntity<ObjetoArmazenado> getCpf(@PathVariable(value = "cpfCliente") String cpfCliente){
        Optional<ObjetoArmazenado> objetoArmazenadoOptional = objetoArmazenadoService.findCpf(cpfCliente);
        if (objetoArmazenadoOptional.isPresent()){
            return new ResponseEntity<>(objetoArmazenadoOptional.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{cpfCliente}")
    public ResponseEntity<ObjetoArmazenado> deletaObjeto(@PathVariable(value = "cpfCliente") String cpfCliente){
        Optional<ObjetoArmazenado> objetoArmazenadoOptional = objetoArmazenadoService.findCpf(cpfCliente);
        if (objetoArmazenadoOptional.isPresent()){
            objetoArmazenadoService.deletar(objetoArmazenadoOptional.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{cpfCliente}")
    public ResponseEntity<ObjetoArmazenado> atualizarEndereco(@PathVariable(value = "cpfCliente") String cpfCliente, @RequestBody @Valid ObjetoArmazenadoDto objetoArmazenadoDto){
        Optional<ObjetoArmazenado> objetoArmazenadoOptional = objetoArmazenadoService.findCpf(cpfCliente);
        if(objetoArmazenadoOptional.isPresent()){
            var objetoArmazenado = new ObjetoArmazenado();
            BeanUtils.copyProperties(objetoArmazenadoDto, objetoArmazenado);
            return new ResponseEntity<>(objetoArmazenadoService.create(objetoArmazenado), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}




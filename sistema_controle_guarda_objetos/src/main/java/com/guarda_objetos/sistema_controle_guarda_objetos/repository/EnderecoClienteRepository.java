package com.guarda_objetos.sistema_controle_guarda_objetos.repository;

import com.guarda_objetos.sistema_controle_guarda_objetos.model.EnderecoCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoClienteRepository extends JpaRepository<EnderecoCliente, String> {

}

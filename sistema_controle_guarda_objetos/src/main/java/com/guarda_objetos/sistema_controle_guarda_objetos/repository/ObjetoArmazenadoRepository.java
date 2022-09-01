package com.guarda_objetos.sistema_controle_guarda_objetos.repository;

import com.guarda_objetos.sistema_controle_guarda_objetos.model.ObjetoArmazenado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ObjetoArmazenadoRepository extends JpaRepository<ObjetoArmazenado, Integer> {


}

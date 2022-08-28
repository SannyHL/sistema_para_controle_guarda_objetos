package com.guarda_objetos.sistema_controle_guarda_objetos.repository;

import com.guarda_objetos.sistema_controle_guarda_objetos.model.ObjetoArmazenado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ObjetoArmazenadoRepository extends JpaRepository<ObjetoArmazenado, String> {

    ObjetoArmazenado findByCpf(String cpfCliente);
    List<ObjetoArmazenado> queryByNameLike(String nome);

}

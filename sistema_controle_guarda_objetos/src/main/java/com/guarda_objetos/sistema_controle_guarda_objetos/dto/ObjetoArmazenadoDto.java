package com.guarda_objetos.sistema_controle_guarda_objetos.dto;

import com.guarda_objetos.sistema_controle_guarda_objetos.model.Clientes;
import com.guarda_objetos.sistema_controle_guarda_objetos.model.ObjetoArmazenado;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class ObjetoArmazenadoDto {

    @NotBlank
    private String nome;
    @NotBlank
    private String temObjetosArmazenado;
    @NotBlank
    private String quantidadeObjetosArmazenados;
    @NotBlank
    private String descricaoObjetos;
    @NotBlank
    private String dataArmazenamento;
    @NotBlank
    private String dataPrevistaRetirada;
    private String dataRetirada;

    private Clientes clienteResponsavel;

    public Clientes getClienteResponsavel() {
        return clienteResponsavel;
    }

    public void setClienteResponsavel(Clientes clienteResponsavel) {
        this.clienteResponsavel = clienteResponsavel;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTemObjetosArmazenado() {
        return temObjetosArmazenado;
    }

    public void setTemObjetosArmazenado(String temObjetosArmazenado) {
        this.temObjetosArmazenado = temObjetosArmazenado;
    }

    public String getQuantidadeObjetosArmazenados() {
        return quantidadeObjetosArmazenados;
    }

    public void setQuantidadeObjetosArmazenados(String quantidadeObjetosArmazenados) {
        this.quantidadeObjetosArmazenados = quantidadeObjetosArmazenados;
    }

    public String getDescricaoObjetos() {
        return descricaoObjetos;
    }

    public void setDescricaoObjetos(String descricaoObjetos) {
        this.descricaoObjetos = descricaoObjetos;
    }

    public String getDataArmazenamento() {
        return dataArmazenamento;
    }

    public void setDataArmazenamento(String dataArmazenamento) {
        this.dataArmazenamento = dataArmazenamento;
    }

    public String getDataPrevistaRetirada() {
        return dataPrevistaRetirada;
    }

    public void setDataPrevistaRetirada(String dataPrevistaRetirada) {
        this.dataPrevistaRetirada = dataPrevistaRetirada;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }


}

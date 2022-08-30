package com.guarda_objetos.sistema_controle_guarda_objetos.dto;

import com.guarda_objetos.sistema_controle_guarda_objetos.model.ObjetoArmazenado;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class ObjetoArmazenadoDto {

    @NotBlank
    private String cpfCliente;
    @NotBlank
    private String nome;
    @NotBlank
    private Boolean objetosArmazenado;
    @NotBlank
    private Integer quantidadeObjetosArmazenados;
    @NotBlank
    private String descricaoObjetos;
    @NotBlank
    private String dataArmazenamento;
    @NotBlank
    private String dataPrevistaRetirada;
    private String dataRetirada;

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getObjetosArmazenado() {
        return objetosArmazenado;
    }

    public void setObjetosArmazenado(Boolean objetosArmazenado) {
        this.objetosArmazenado = objetosArmazenado;
    }

    public Integer getQuantidadeObjetosArmazenados() {
        return quantidadeObjetosArmazenados;
    }

    public void setQuantidadeObjetosArmazenados(Integer quantidadeObjetosArmazenados) {
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

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
    private Date dataArmazenamento;
    @NotBlank
    private Date dataPrevistaRetirada;
    private Date dataRetirada;

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

    public Date getDataArmazenamento() {
        return dataArmazenamento;
    }

    public void setDataArmazenamento(Date dataArmazenamento) {
        this.dataArmazenamento = dataArmazenamento;
    }

    public Date getDataPrevistaRetirada() {
        return dataPrevistaRetirada;
    }

    public void setDataPrevistaRetirada(Date dataPrevistaRetirada) {
        this.dataPrevistaRetirada = dataPrevistaRetirada;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }


}

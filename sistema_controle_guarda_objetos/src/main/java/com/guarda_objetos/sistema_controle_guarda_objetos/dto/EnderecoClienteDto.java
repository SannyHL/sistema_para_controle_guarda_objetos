package com.guarda_objetos.sistema_controle_guarda_objetos.dto;


import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.util.Date;

public class EnderecoClienteDto {

    @NotBlank
    private String cpfCliente;
    @NotBlank
    private String nome;
    @NotBlank
    private String rua;
    @NotBlank
    private String numeroCasa;
    @NotBlank
    private String bairro;
    @NotBlank
    private String cidade;
    @NotBlank
    private String estado;
    @NotBlank
    private String pais;
    @NotBlank
    private Date dataCadastroEndereco;

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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getDataCadastroEndereco() {
        return dataCadastroEndereco;
    }

    public void setDataCadastroEndereco(Date dataCadastroEndereco) {
        this.dataCadastroEndereco = dataCadastroEndereco;
    }
}

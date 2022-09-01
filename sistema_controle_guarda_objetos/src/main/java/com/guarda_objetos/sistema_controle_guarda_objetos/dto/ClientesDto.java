package com.guarda_objetos.sistema_controle_guarda_objetos.dto;

import com.guarda_objetos.sistema_controle_guarda_objetos.model.EnderecoCliente;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.util.Date;

public class ClientesDto {

    @NotBlank
    private String cpfCliente;
    @NotBlank
    private String nome;
    @NotBlank
    private String dataNascimento;

    private String email;
    @NotBlank
    private String telefone;

    private String telefoneFixo;

    private String whatsapp;

    @NotBlank
    private String numeroCasa;

    @NotBlank
    private String complementoCasa;

    private EnderecoCliente cep;

    public EnderecoCliente getCep() {
        return cep;
    }

    public void setCep(EnderecoCliente cep) {
        this.cep = cep;
    }

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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getComplementoCasa() {
        return complementoCasa;
    }

    public void setComplementoCasa(String complementoCasa) {
        this.complementoCasa = complementoCasa;
    }
}

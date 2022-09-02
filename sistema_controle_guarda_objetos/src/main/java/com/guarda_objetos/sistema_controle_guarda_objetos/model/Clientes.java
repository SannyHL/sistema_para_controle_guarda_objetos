package com.guarda_objetos.sistema_controle_guarda_objetos.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_clientes")
public class Clientes {
    @Id
    @Column(nullable = false, length = 15)
    private String cpfCliente;

    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, length = 15)
    private String dataNascimento;
    @Column(nullable = false, length = 50)
    private String email;
    @Column(nullable = false, length = 15)
    private String telefone;
    @Column(nullable = false, length = 15)
    private String telefoneFixo;
    @Column(nullable = false, length = 15)
    private String whatsapp;

    @Column(nullable = false, length = 15)
    private String numeroCasa;

    @Column(nullable = false, length = 50)
    private String complementoCasa;
    @Column(nullable = false)
    private LocalDateTime dataRegistro;

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

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public EnderecoCliente getCep() {
        return cep;
    }

    public void setCep(EnderecoCliente cep) {
        this.cep = cep;
    }

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private EnderecoCliente cep;

}

package com.guarda_objetos.sistema_controle_guarda_objetos.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CLIENTES")
public class Clientes {
    @Id
    @Column(nullable = false, length = 15)
    private String cpfCliente;

    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, length = 15)
    private Date dataNascimento;
    @Column(nullable = false, length = 50)
    private String email;
    @Column(nullable = false, length = 15)
    private String telefone;
    @Column(nullable = false, length = 15)
    private String telefoneFixo;
    @Column(nullable = false, length = 15)
    private String whatsapp;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
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

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }



    @OneToMany(mappedBy = "clientes")
    private List<ObjetoArmazenado> objetoArmazenado;
    @OneToOne(mappedBy = "clientes")
    private EnderecoCliente enderecoCliente;

}

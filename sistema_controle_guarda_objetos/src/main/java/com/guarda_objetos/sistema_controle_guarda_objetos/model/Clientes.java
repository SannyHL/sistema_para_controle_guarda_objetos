package com.guarda_objetos.sistema_controle_guarda_objetos.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CLIENTES")
public class Clientes {
    @Id
    private String cpfCliente;
    @Column
    private String nome;
    @Column
    private Date dataNascimento;
    @Column
    private String email;
    @Column
    private String telefone;
    @Column
    private String telefoneFixo;
    @Column
    private String whatsapp;
    @Column
    private LocalDate dataRegistro;

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

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }


    @OneToMany(mappedBy = "clientes")
    private List<ObjetoArmazenado> objetoArmazenado;
    @OneToOne(mappedBy = "clientes")
    private EnderecoCliente enderecoCliente;

}

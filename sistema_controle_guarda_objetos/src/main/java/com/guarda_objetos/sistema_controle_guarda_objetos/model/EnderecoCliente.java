package com.guarda_objetos.sistema_controle_guarda_objetos.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "endereco")
public class EnderecoCliente {

    @Id
    @Column(nullable = false, length = 15)
    private String cpfCliente;

    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, length = 30)
    private String rua;
    @Column(nullable = false, length = 15)
    private String numeroCasa;
    @Column(nullable = false, length = 15)
    private String bairro;
    @Column(nullable = false, length = 15)
    private String cidade;
    @Column(nullable = false, length = 15)
    private String estado;
    @Column(nullable = false, length = 15)
    private String pais;
    @Column(nullable = false)
    private LocalDateTime dataCadastroEndereco;

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
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

    public LocalDateTime getDataCadastroEndereco() {
        return dataCadastroEndereco;
    }

    public void setDataCadastroEndereco(LocalDateTime dataCadastroEndereco) {
        this.dataCadastroEndereco = dataCadastroEndereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}

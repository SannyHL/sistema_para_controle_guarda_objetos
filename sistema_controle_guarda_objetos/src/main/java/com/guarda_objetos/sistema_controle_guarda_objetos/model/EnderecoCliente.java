package com.guarda_objetos.sistema_controle_guarda_objetos.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "endereco")
public class EnderecoCliente {

    @Id
    @Column(nullable = false, length = 15)
    private Long cep;

    @Column(nullable = false, length = 30)
    private String rua;
    @Column(nullable = false, length = 15)
    private String numeroCasa;

    @Column(nullable = false, length = 15)
    private String complemento;

    @Column(nullable = false, length = 15)
    private String bairro;
    @Column(nullable = false, length = 15)
    private String cidade;
    @Column(nullable = false, length = 15)
    private String estado;
    @Column(nullable = false, length = 15)
    private String pais;

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
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

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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



}

package com.guarda_objetos.sistema_controle_guarda_objetos.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ENDERECO_CLIENTE")
public class EnderecoCliente {

    @Id
    private String cpfCliente;

    @Column
    private String nome;
    @Column
    private String rua;
    @Column
    private String numeroCasa;
    @Column
    private String bairro;
    @Column
    private String cidade;
    @Column
    private String estado;
    @Column
    private String pais;
    @Column
    private Date dataCadastroEndereco;

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

    public Date getDataCadastroEndereco() {
        return dataCadastroEndereco;
    }

    public void setDataCadastroEndereco(Date dataCadastroEndereco) {
        this.dataCadastroEndereco = dataCadastroEndereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "clientes_cpfCliente", referencedColumnName = "cpfCliente") ,
            @JoinColumn(name = "clientes_nome", referencedColumnName = "nome")
    })
    private Clientes clientes;

}

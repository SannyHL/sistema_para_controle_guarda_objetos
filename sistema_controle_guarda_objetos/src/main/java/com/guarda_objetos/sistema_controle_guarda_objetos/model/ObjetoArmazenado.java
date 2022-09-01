package com.guarda_objetos.sistema_controle_guarda_objetos.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tb_objetos_armazenados")
public class ObjetoArmazenado implements Serializable{

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id")
    @Id
    @Column(unique = false)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, length = 100)
    private String temObjetosArmazenado;
    @Column(nullable = false, length = 5)
    private String quantidadeObjetosArmazenados;
    @Column(nullable = false, length = 100)
    private String descricaoObjetos;
    @Column(nullable = false, length = 15)
    private String dataArmazenamento;
    @Column(nullable = false, length = 15)
    private String dataPrevistaRetirada;
    @Column(length = 15)
    private String dataRetirada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getQuantidadeObjetosArmazenados() {
        return quantidadeObjetosArmazenados;
    }

    public void setQuantidadeObjetosArmazenados(String quantidadeObjetosArmazenados) {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Clientes getClienteResponsavel() {
        return clienteResponsavel;
    }

    public void setClienteResponsavel(Clientes clienteResponsavel) {
        this.clienteResponsavel = clienteResponsavel;
    }

    public String getTemObjetosArmazenado() {
        return temObjetosArmazenado;
    }

    public void setTemObjetosArmazenado(String temObjetosArmazenado) {
        this.temObjetosArmazenado = temObjetosArmazenado;
    }

    @ManyToOne
    @JoinColumn(name = "tb_clientes_id")
    private Clientes clienteResponsavel;

}

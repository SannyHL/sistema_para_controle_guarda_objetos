package com.guarda_objetos.sistema_controle_guarda_objetos.model;

import com.guarda_objetos.sistema_controle_guarda_objetos.dto.ObjetoArmazenadoDto;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DADOS_OBJETOS_ARMAZENADOS")
public class ObjetoArmazenado {

    @Id
    @Column(nullable = false, length = 15)
    private String cpfCliente;

    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, length = 100)
    private Boolean objetosArmazenado;
    @Column(nullable = false, length = 5)
    private Integer quantidadeObjetosArmazenados;
    @Column(nullable = false, length = 100)
    private String descricaoObjetos;
    @Column(nullable = false, length = 15)
    private String dataArmazenamento;
    @Column(nullable = false, length = 15)
    private String dataPrevistaRetirada;
    @Column(length = 15)
    private String dataRetirada;

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
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



    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "clientes_cpfCliente", referencedColumnName = "cpfCliente") ,
            @JoinColumn(name = "clientes_nome", referencedColumnName = "nome")
    })

    private Clientes clientes;
}

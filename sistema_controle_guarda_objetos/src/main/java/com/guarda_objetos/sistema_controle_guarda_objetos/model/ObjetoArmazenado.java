package com.guarda_objetos.sistema_controle_guarda_objetos.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DADOS_OBJETOS_ARMAZENADOS")
public class ObjetoArmazenado {

    @Id
    private String cpfCliente;

    @Column
    private String nome;
    @Column
    private Boolean objetoArmazenado;
    @Column
    private Integer quantidadeObjetosArmazenados;
    @Column
    private String descricaoObjetos;
    @Column
    private Date dataArmazenamento;
    @Column
    private Date dataPrevistaRetirada;
    @Column
    private Date dataRetirada;

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Boolean getObjetoArmazenado() {
        return objetoArmazenado;
    }

    public void setObjetoArmazenado(Boolean objetoArmazenado) {
        this.objetoArmazenado = objetoArmazenado;
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

    public Date getDataArmazenamento() {
        return dataArmazenamento;
    }

    public void setDataArmazenamento(Date dataArmazenamento) {
        this.dataArmazenamento = dataArmazenamento;
    }

    public Date getDataPrevistaRetirada() {
        return dataPrevistaRetirada;
    }

    public void setDataPrevistaRetirada(Date dataPrevistaRetirada) {
        this.dataPrevistaRetirada = dataPrevistaRetirada;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
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

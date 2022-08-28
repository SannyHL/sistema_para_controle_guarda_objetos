package com.guarda_objetos.sistema_controle_guarda_objetos.dto;

import com.guarda_objetos.sistema_controle_guarda_objetos.model.Clientes;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;

public class ClientesDto {

    @NotBlank
    private String cpfCliente;
    @NotBlank
    private String nome;
    @NotBlank
    private Date dataNascimento;

    private String email;
    @NotBlank
    private String telefone;

    private String telefoneFixo;

    private String whatsapp;

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


    public static ClientesDto convert(Clientes clientes){
        var clientesDto = new ClientesDto();
        clientesDto.setCpfCliente(clientes.getCpfCliente());
        clientesDto.setNome(clientes.getNome());
        clientesDto.setEmail(clientes.getEmail());
        clientesDto.setTelefone(clientes.getTelefone());
        clientesDto.setWhatsapp(clientes.getWhatsapp());
        clientesDto.setDataNascimento(clientes.getDataNascimento());
        clientesDto.setTelefoneFixo(clientes.getTelefoneFixo());

        return clientesDto;
    }
}

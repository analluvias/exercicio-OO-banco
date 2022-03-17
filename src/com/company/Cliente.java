package com.company;

import java.util.List;

public class Cliente {

    private String nome;
    private String cpf;

    /**
     * Esse é o método que é chamado sempre que criamos um novo cliente, por isso que faremos:
     * Cliente cliente = new Cliente("Nome_do_cliente", "cpf_do_cliente)
     * @param nome String - nome do cliente
     * @param cpf String - CPF do cliente
     */
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

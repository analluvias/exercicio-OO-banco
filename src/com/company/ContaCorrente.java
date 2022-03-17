package com.company;

public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaCorrente(Cliente cliente, Banco banco){
        super.agencia = Conta.ID_AGENCIA;
        super.numero = SEQUENCIAL++;
        super.tipoConta = "CORRENTE";
        super.cliente = cliente; // aqui é onde adicionamos efetivamente o cliente nessa C. Corrente.
        super.banco = banco;
    }

}

package com.company;

public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 1; // dizemos que é estática uma variável que terá sua vida útil durante toda a execução do programa

    public ContaPoupanca(Cliente cliente, Banco banco){
        super.agencia = Conta.ID_AGENCIA;
        super.numero = SEQUENCIAL++;
        super.tipoConta = "POUPANCA";
        super.cliente = cliente; // aqui é onde adicionamos efetivamente o cliente nessa C. Poupança.
        super.banco = banco;
    }
}

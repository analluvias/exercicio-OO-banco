package com.company;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente1 = new Cliente("Ana Meira", "555555");
        Cliente cliente2 = new Cliente("Vinícius Pamplona", "3333333");

        Conta cCorrente1 = new ContaCorrente(cliente1, banco);
        banco.adicionaConta(cCorrente1);

        Conta cCorrente2 = new ContaCorrente(cliente2, banco);
        banco.adicionaConta(cCorrente2);

        Conta cPoupanca1 = new ContaPoupanca(cliente2, banco);
        banco.adicionaConta(cPoupanca1);

        cCorrente1.depositar(100);
        cCorrente1.transferir(20, cPoupanca1);

        cCorrente1.imprimirExtrato();
        cCorrente2.imprimirExtrato();
        cPoupanca1.imprimirExtrato();
    }
}

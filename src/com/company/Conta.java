package com.company;

import org.jetbrains.annotations.NotNull;

public class Conta {

    protected static String ID_AGENCIA = "1";

    protected String agencia;
    protected int numero;
    protected double saldo;
    protected String tipoConta;
    protected Banco banco; // uma conta pertence a um banco
    protected Cliente cliente;
    /* Como toda conta pertence a um cliente, devemos sempre primeiro cadastrar/criar o cliente, para que depois
       possamos criar as contas que pertencem a esse cliente.
       Por isso, passamos um Cliente como parâmetro na criação de uma nova conta.
     */

    /** Método que imprimirá o extrato da conta, seja corrente ou poupança
     */
    public void imprimirExtrato(){
        System.out.println("=== EXTRATO DE CONTA "+this.getTipoConta()+" ===");
        System.out.println(" Cliente: "+ this.cliente.getNome());
        System.out.println(" Conta: "+ this.getNumero());
        System.out.println(" Agencia: "+ this.getAgencia());
        System.out.println(" Saldo: R$ "+ String.format("%.2f", this.getSaldo()));
        System.out.println();
    }

    /**Método utilizado para que os clientes de conta corrente e poupança possam fazer saques.
     * @param valor double - valor a ser sacado
     */
    public void sacar(double valor){
        if (this.getSaldo() - valor >= 0){
            this.saldo = this.saldo - valor;
        }
        else {
            System.out.println("Não há saldo o suficiente para esta operação.");
        }

    }

    /**Método utilizado para depositar valor na conta do usuário (seja corrente ou poupança).
     * @param valor double - valor a ser depositado.
     */
    public void depositar(double valor){

        this.saldo = this.saldo + valor;

    }

    /**
     *Método com a função de tranferir valores da conta do cliente para outra conta.
     * @param valorTransferir double - valor a ser transferido.
     * @param contaDeposito Conta - conta a receber o valor.
     */
    public void transferir(double valorTransferir, @NotNull Conta contaDeposito){

        this.sacar(valorTransferir);
        contaDeposito.depositar(valorTransferir);

    }

    /**
     * Método get da agência das contas do tipo corrente e poupança.
     * @return agencia da conta
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Método get do número das contas do tipo corrente e poupança.
     * @return número da conta
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método get do saldo das contas do tipo corrente e poupança.
     * @return saldo da conta
     */
    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public Cliente getCliente() {
        return cliente;
    }
}

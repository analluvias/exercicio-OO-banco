package com.company;

import java.util.List;

public class Banco {

    protected static String NOME_DO_BANCO = "BANCS";
    protected static String CNPJ = "00000";

    protected String nomeBanco;
    protected String cnpjBanco;
    protected List <Conta> contasExistentes;

    public Banco() {
        this.nomeBanco = NOME_DO_BANCO;
        this.cnpjBanco = CNPJ;
    }

    public String getCnpjBanco() {
        return cnpjBanco;
    }

    public void setCnpjBanco(String cnpjBanco) {
        this.cnpjBanco = cnpjBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    /**
     * Método que checará se uma conta existe no banco.
     * @param nomeDonoContaCheck String - nome cadastrado ao fazer conta.
     * @param tipoContaCheck String - tipo da conta.
     * @return boolean
     */
    public boolean existeConta(String nomeDonoContaCheck, String tipoContaCheck) {

        for(Conta conta : contasExistentes){
            if (conta.cliente.getNome().equals(nomeDonoContaCheck) &&
                conta.getTipoConta().equals(tipoContaCheck)){

                return true;

            }
        }
        return false;
    }

    public void adicionaConta(Conta conta){
        contasExistentes.add(conta);
    }

    public void excluiConta(String nomeDonoContaCheck, String tipoContaCheck, int numeroContaCheck){

        for (Conta conta : contasExistentes){

            if (conta.cliente.getNome().equals(nomeDonoContaCheck) &&
                    conta.getTipoConta().equals(tipoContaCheck) &&
                    conta.getNumero() == numeroContaCheck){

                contasExistentes.remove(conta);
                break;

            }
        }
    }

}

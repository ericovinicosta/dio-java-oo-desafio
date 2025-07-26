package dio.java.oo.desafio.erico.classes;

import dio.java.oo.desafio.erico.interfaces.InterfaceConta;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public abstract class Conta implements InterfaceConta {
    private static final String AGENCIA_PADRAO="001";
    private static int SEQUENCIAL = 1;

    protected double saldo;
    protected String agencia;
    protected int numero;
    protected ArrayList<Cliente> cliente;

    Conta(ArrayList<Cliente> cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
    }

    @Override
    public void sacarDaConta(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositarNaConta(double valor) {
        this.saldo +=  valor;
    }

    @Override
    public void transferirDaConta(double valor, Conta conta) {
        this.sacarDaConta(valor);
        conta.depositarNaConta(valor);

    }

    @Override
    public void extratoDaConta() {
        System.out.println("Extrato para Conferência Simples");
        System.out.println("================================");
        System.out.printf("Agência: %s Conta: %s\n\n", this.getAgencia(), this.getNumero());
    }

    public abstract double getSaldo();

    public abstract void setSaldo(double saldo);

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

}

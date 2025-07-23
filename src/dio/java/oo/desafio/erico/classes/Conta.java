package dio.java.oo.desafio.erico.classes;

import dio.java.oo.desafio.erico.interfaces.InterfaceConta;

public abstract class Conta implements InterfaceConta {
    private static final String AGENCIA_PADRAO="001";
    private static int SEQUENCIAL = 1;

    protected double saldo;
    protected String agencia;
    protected int numero;
    protected Cliente cliente;

    Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
    }

    public abstract double getSaldo();

    public abstract void setSaldo(double saldo);

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

}

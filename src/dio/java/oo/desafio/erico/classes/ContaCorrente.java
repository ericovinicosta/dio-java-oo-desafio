package dio.java.oo.desafio.erico.classes;

import dio.java.oo.desafio.erico.interfaces.InterfaceConta;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ContaCorrente extends Conta implements InterfaceConta {

    private double limite;

    ContaCorrente() {
        super();
        this.limite = 0;
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
        if( conta != null  || (this.saldo + this.limite) >= valor) {
            this.sacarDaConta(valor);
            conta.depositarNaConta(valor);
        } else if(this.saldo >= valor) {
            System.out.println("Saldo insuficiente");
        } else if (conta == null) {
            System.out.println("Conta de destino não existe");
        } else {
            System.out.println("Erro na transferência");
        }
    }

    @Override
    public void extratoDaConta() {
        String data = DateFormat.getDateInstance().format(new Date());
        System.out.println("Extrato para Conferência Simples");
        System.out.println("================================");
        System.out.printf("Agência: %s Conta: %s\n\n", this.getAgencia(), this.getNumero());
        System.out.printf("Saldo: %.2f\n", this.saldo);
        System.out.printf("Limite: %.2f\n", this.limite);
        System.out.printf("Saldo + Limite: %.2f\n", (this.saldo + this.limite));
        String hora = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.printf("Emitido em %s às %s\n", data, hora);
        System.out.println("================================");
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}

package dio.java.oo.desafio.erico.classes;

import dio.java.oo.desafio.erico.interfaces.InterfaceConta;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ContaPoupanca extends Conta implements InterfaceConta {

    ContaPoupanca(){
        super();
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
        if( conta != null  || this.saldo >= valor) {
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
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void extratoDaConta() {
        String data = DateFormat.getDateInstance().format(new Date());
        System.out.println("Extrato para Conferência Simples");
        System.out.println("================================");
        System.out.printf("Agência: %s Conta: %s\n\n", this.getAgencia(), this.getNumero());
        System.out.printf("Saldo na data %s é %.2f\n", data, this.saldo);
        String hora = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.printf("Emitido às %s\n", hora);
        System.out.println("================================");
    }
}

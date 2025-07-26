package dio.java.oo.desafio.erico.classes;

import dio.java.oo.desafio.erico.interfaces.InterfaceConta;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    public ContaPoupanca(ArrayList<Cliente> cliente) {
        super(cliente);
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void transferir(double valor, Conta conta){
        if(this.saldo < valor) {
            System.out.println("Saldo insuficiente");
        } else if (conta == null) {
            System.out.println("Conta de destino não existe");
        } else {
            super.transferirDaConta(valor, conta);
        }
    }
    public void extratoConta() {
        String data = DateFormat.getDateInstance().format(new Date());
        super.extratoDaConta();
        System.out.printf("Saldo na data %s é %.2f\n", data, this.saldo);
        String hora = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.printf("Emitido às %s\n", hora);
        System.out.println("================================");
    }
}

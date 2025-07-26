package dio.java.oo.desafio.erico.classes;

import dio.java.oo.desafio.erico.interfaces.InterfaceConta;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ContaCorrente extends Conta {

    private double limite;

    ContaCorrente(ArrayList<Cliente> cliente) {
        super(cliente);
        this.limite = 0;
    }
    public void transferir(double valor, Conta conta){
        if(this.saldo + this.limite < valor) {
            System.out.println("Saldo insuficiente");
        } else if (conta == null) {
            System.out.println("Conta de destino não existe");
        } else {
            super.transferirDaConta(valor, conta);
        }
    }
    public void extratoConta(){
        String data = DateFormat.getDateInstance().format(new Date());
        super.extratoDaConta();
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

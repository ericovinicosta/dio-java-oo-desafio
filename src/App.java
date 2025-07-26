import dio.java.oo.desafio.erico.classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        final Banco amaracaoBB = new Banco("AmaracaoBB");
        Cliente c1 = new Cliente("001.002.003-25", "Carlos Alberto");
        Cliente c2 = new Cliente("002.003.004-25", "Maria Alberto");
        Cliente c3 = new Cliente("003.004.005-25", "Carla Maria Alberto");

        amaracaoBB.addCliente(c1);
        amaracaoBB.addCliente(c2);
        amaracaoBB.addCliente(c3);

        ContaCorrente conta1 =  new ContaCorrente(c1);
        ContaCorrente conta2 =  new ContaCorrente(c2);
        ContaPoupanca conta3 =  new ContaPoupanca(c3);

        amaracaoBB.addConta(conta1);
        amaracaoBB.addConta(conta2);
        amaracaoBB.addConta(conta3);

        conta1.setSaldo(1000.00);
        conta1.setLimite(500.00);

        conta2.setLimite(200.00);

        conta1.transferir(200.00, conta2);
        conta1.transferir(400.00, conta3);

        conta2.transferir(400.00, conta3);

        conta1.extratoConta();
        conta2.extratoConta();
        conta3.extratoConta();
    }
}

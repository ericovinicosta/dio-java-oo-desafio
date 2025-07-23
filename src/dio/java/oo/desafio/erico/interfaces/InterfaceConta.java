package dio.java.oo.desafio.erico.interfaces;

import dio.java.oo.desafio.erico.classes.Conta;

public interface InterfaceConta {
    void sacarDaConta(double valor);
    void depositarNaConta(double valor);
    void transferirDaConta(double valor, Conta conta);
    void extratoDaConta();
}

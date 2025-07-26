package dio.java.oo.desafio.erico.classes;

import java.util.ArrayList;
import java.util.HashSet;

public class Banco {

    public final int CODIGO = 1;
    private String nomeDoBanco = "Banco do DIO";
    private final HashSet<Cliente> cliente;
    private final HashSet<Conta> conta;

    Banco(String nome){
        this.nomeDoBanco = nome;
        cliente = new HashSet<>();
        conta = new HashSet<>();
    }

    public void addCliente(Cliente cliente) {
        if(!this.cliente.add(cliente)) {
            System.out.printf("%s já é cliente", cliente.getNome());
        }
    }

    public void delCliente(Cliente cliente){
        if (this.cliente.isEmpty()) {
            System.out.println("Não foi possível excluir!");
        } else {
            this.cliente.remove(cliente);
        }
    }

    public void addConta(Conta conta){
        if(!this.conta.add(conta)) {
            System.out.printf("%s já existe", conta.getNumero());
        }
    }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public HashSet<Cliente> getCliente() {
        return cliente;
    }

    public HashSet<Conta> getConta() {
        return conta;
    }
}

package dio.java.oo.desafio.erico.classes;

public class Cliente {

    private static int CODIGO_CLIENTE = 1;

    private String nome;
    private String cpf;
    private int codigo;

    public Cliente( String cpf, String nome){

        this.cpf = cpf;
        this.nome = nome;
        this.codigo = CODIGO_CLIENTE++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public int getCodigo() {
        return codigo;
    }
}

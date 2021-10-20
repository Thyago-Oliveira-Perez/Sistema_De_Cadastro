package View;

public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;
    private String cnpj;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String cpf, String cnpj) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.cnpj = cnpj;
    }

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

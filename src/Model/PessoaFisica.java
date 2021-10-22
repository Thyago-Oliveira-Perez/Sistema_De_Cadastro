package Model;

import Model.Pessoa;

public class PessoaFisica extends Pessoa {

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    @Override
    public String toString() {
        return getNome() +" "+ getIdade() +" "+ getCpf();
    }
}

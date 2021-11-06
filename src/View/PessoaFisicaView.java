package View;

import Controller.PessoaFisicaController;
import Model.PessoaFisica;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaFisicaView {

    Scanner entrada = new Scanner(System.in);
    PessoaFisicaController pessoaFisicaController = new PessoaFisicaController();
    List<PessoaFisica> pessoaFisicaList = new ArrayList<>();

    public void cadastraPessoaFisica() throws SQLException {

        PessoaFisica pessoaF1 = new PessoaFisica();

        System.out.print("Nome:");
        String nome = entrada.next();

        System.out.print("Idade: ");
        int idade = entrada.nextInt();

        System.out.print("CPF:");
        String cpf = entrada.next();

        pessoaF1 = new PessoaFisica(nome, idade, cpf);
        pessoaFisicaList.add(pessoaF1);

        System.out.println("Deseja continuar o cadastro?\n 1 - Sim\n2 - Não");
        int regOrNot = entrada.nextInt();

        if(regOrNot == 2){

            pessoaFisicaController.registraNoBanco(pessoaFisicaList);

        }else{

            cadastraPessoaFisica();

        }

    }

    public List<PessoaFisica> exibirDadosBanco(){

        return pessoaFisicaController.exibirDadosBanco();

    }

}

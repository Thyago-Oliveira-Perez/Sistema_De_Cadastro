package View;

import Controller.PessoaFisicaController;
import Model.PessoaFisica;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuView {

    public MenuView() {
    }

    public void mostrarMenu() throws SQLException {

        PessoaFisicaController pessoaFiscControl = new PessoaFisicaController();

        Scanner entrada = new Scanner(System.in);

        System.out.println("-----------------------------------------------");
        System.out.println("1 - Cadastrar\n2 - Deletar\n3 - Editar\n0 - Sair");
        System.out.println("-----------------------------------------------");

        int opcao = entrada.nextInt();

        switch (opcao){

            case 1:

                cadastraPessoaFisica(entrada, pessoaFiscControl);

                break;

            case 2:
                break;

            case 3:
                break;

            case 0:
                break;

            default:
        }

    }

    public void cadastraPessoaFisica(Scanner entrada, PessoaFisicaController pessoaFiscControl) throws SQLException {

        PessoaFisica pessoaF1 = new PessoaFisica();

        System.out.print("Nome:");
        String nome = entrada.next();

        System.out.print("Idade: ");
        int idade = entrada.nextInt();

        System.out.print("CPF:");
        String cpf = entrada.next();

        pessoaF1 = new PessoaFisica(nome, idade, cpf);

        pessoaFiscControl.mostraDadosBanco();

    }

}

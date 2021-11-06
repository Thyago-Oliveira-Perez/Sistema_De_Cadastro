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
        PessoaFisicaView pessoaFisicaView = new PessoaFisicaView();

        Scanner entrada = new Scanner(System.in);

        System.out.println("-----------------------------------------------");
        System.out.println("1 - Cadastrar\n2 - Deletar\n3 - Editar\n0 - Sair");
        System.out.println("-----------------------------------------------");

        int opcao = entrada.nextInt();

        switch (opcao){

            case 1:
                pessoaFisicaView.cadastraPessoaFisica();
                break;
            case 2:
                break;
            case 3:
                System.out.println(pessoaFisicaView.exibirDadosBanco());

                System.out.println(pessoaFisicaView.exibirDadosBanco().size());

                break;
            case 0:
                System.exit(0);
                break;
            default:
        }

    }

}

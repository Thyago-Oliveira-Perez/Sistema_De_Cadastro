package View;

import Controller.PessoaFisicaController;
import Model.PessoaFisica;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuView {

    public MenuView() {
    }

    public void mostrarMenu() throws SQLException {

        PessoaFisicaView pessoaFisicaView = new PessoaFisicaView();
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("1 - Cadastrar\n2 - Deletar\n3 - Editar\n4 - Mostrar\n0 - Sair");
        System.out.println("-----------------------------------------------");

        int opcao = entrada.nextInt();

        switch (opcao){
            case 1:
                pessoaFisicaView.cadastraPessoaFisica();
                mostrarMenu();
                break;
            case 2:
                pessoaFisicaView.deletarPessoaFisica();
                mostrarMenu();
                break;
            case 3:
                pessoaFisicaView.editar();
                mostrarMenu();
                break;
            case 4:
                pessoaFisicaView.exibirDadosBanco();
                mostrarMenu();
                break;
            case 0:
                System.exit(0);
                break;
            default:
        }
    }
}

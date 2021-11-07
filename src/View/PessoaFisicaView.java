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
        int j = pessoaFisicaController.exibirDadosBanco().size();
        for(int i = 0; i < j; i++){
            System.out.println(pessoaFisicaController.exibirDadosBanco().get(i));
        }
        return null;
    }

    public void editar(){
        String coluna;
        String novoValor;
        System.out.println(exibirDadosBanco());
        System.out.println("Qual pessoa deseja editar?");
        String idSelecionado = entrada.next();
        System.out.println("O que editar?");
        System.out.println("1 - Nome\n2 - Idade\n3 - CPF");
        int colunaEditar = entrada.nextInt();

        switch (colunaEditar){
            case 1:
                coluna = "Nome";
                System.out.println("Digite o novo valor:");
                novoValor = entrada.next();
                pessoaFisicaController.editar(coluna, novoValor, idSelecionado);
                break;
            case 2:
                coluna = "Idade";
                System.out.println("Digite o novo valor:");
                novoValor = entrada.next();
                pessoaFisicaController.editar(coluna, novoValor, idSelecionado);
                break;
            case 3:
                coluna = "CPF";
                System.out.println("Digite o novo valor:");
                novoValor = entrada.next();
                pessoaFisicaController.editar(coluna, novoValor, idSelecionado);
                break;
        }
    }

    public void deletarPessoaFisica(){
        System.out.println(exibirDadosBanco());
        System.out.println("Qual pessoa você deseja deletar do banco?");
        String delete = entrada.next();
        pessoaFisicaController.deletarPessoaFisica(delete);
    }
}

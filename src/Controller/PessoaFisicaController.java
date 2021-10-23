package Controller;

import DAO.PessoaFDao;
import Model.PessoaFisica;

import java.sql.SQLException;

public class PessoaFisicaController {

    public PessoaFisicaController() {
    }

    public void mostraDadosBanco(){

        PessoaFDao pessoaFDao = new PessoaFDao();

        System.out.println(PessoaFDao.mostraDadosBanco());

    }

    public void registraNoBanco(PessoaFisica pessoaF1){

        PessoaFDao pessoaFDao = new PessoaFDao();

        PessoaFDao.registraNoBanco(pessoaF1);
    }
}

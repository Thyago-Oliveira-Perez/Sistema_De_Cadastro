package Controller;

import DAO.PessoaFDao;
import Model.PessoaFisica;

import java.sql.SQLException;

public class PessoaFisicaController {

    public PessoaFisicaController() {
    }

    public void mostraDadosBanco(){

        PessoaFDao pessoaFDao = new PessoaFDao();

        PessoaFDao.mostraDadosBanco();

    }
}

package Controller;

import DAO.PessoaFDao;
import Model.PessoaFisica;

import java.sql.SQLException;
import java.util.List;

public class PessoaFisicaController {

    PessoaFDao pessoaFDao = new PessoaFDao();

    public List<PessoaFisica> exibirDadosBanco(){

        return pessoaFDao.mostraDadosBanco();
    }

    public void registraNoBanco(List<PessoaFisica> pessoaFisicaList){

        PessoaFDao.cadastraNoBanco(pessoaFisicaList);

    }
}

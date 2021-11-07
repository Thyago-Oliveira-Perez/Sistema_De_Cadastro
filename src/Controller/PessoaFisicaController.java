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

    public void deletarPessoaFisica(String delete){
        pessoaFDao.deletarPessoaFisica(delete);
    }

    public void editar(String coluna, String novoValor, String idSelecionado){
        pessoaFDao.editar(coluna, novoValor, idSelecionado);
    }
}

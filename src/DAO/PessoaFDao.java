package DAO;

import Model.PessoaFisica;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaFDao {

    private static Connection connection;

    public PessoaFDao() {
        connection = ConnectionFactory.getConnection();
    }

    List<PessoaFisica> listaDoBanco = new ArrayList();

    public List<PessoaFisica> mostraDadosBanco(){
        try{
            String QuerrySQLSelect = "SELECT * FROM people";
            PreparedStatement preparedStatement = connection.prepareStatement(QuerrySQLSelect);
            ResultSet resultSet = preparedStatement.executeQuery(QuerrySQLSelect);
            while(resultSet.next()){
                PessoaFisica pessoaDoBanco = new PessoaFisica(resultSet.getString("Nome"), resultSet.getInt("Idade"), resultSet.getString("CPF"));
                listaDoBanco.add(pessoaDoBanco);
            }
            return listaDoBanco;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listaDoBanco;
    }

    public static String cadastraNoBanco(List<PessoaFisica> pessoaFisicaList){
        try{
            String QuerrySQLInsert = "INSERT INTO people" + "(Nome, Idade, CPF)" + "VALUES (?,?,?)";
            for(int i = 0; i < pessoaFisicaList.size(); i++){
                PreparedStatement preparedStatement = connection.prepareStatement(QuerrySQLInsert);
                preparedStatement.setString(1, pessoaFisicaList.get(i).getNome());
                preparedStatement.setInt(2, pessoaFisicaList.get(i).getIdade());
                preparedStatement.setString(3, pessoaFisicaList.get(i).getCpf());
                preparedStatement.execute();
                preparedStatement.close();
            }
            return null;
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return null;
    }

    public void deletarPessoaFisica(String delete){
        try{
            String QuerrySQLDelete = "DELETE FROM people WHERE id =(?)";
            PreparedStatement preparedStatement = connection.prepareStatement(QuerrySQLDelete);
            preparedStatement.setString(1, delete);
            preparedStatement.execute();
            preparedStatement.close();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    public void editar(String coluna, String novoValor, String idSelecionado){
        try {
            String QuerrySQLUpdate = "UPDATE people SET "+ coluna +" = (?) WHERE id=(?)";
            PreparedStatement preparedStatement = connection.prepareStatement(QuerrySQLUpdate);
            preparedStatement.setString(1, novoValor);
            preparedStatement.setString(2, idSelecionado);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

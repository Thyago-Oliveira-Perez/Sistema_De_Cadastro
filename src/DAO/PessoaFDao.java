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

    public static List<PessoaFisica> mostraDadosBanco(){

        try{
            String QuerrySQLSelect = "SELECT * FROM people";
            List<PessoaFisica> listaDoBanco = new ArrayList();
            PreparedStatement preparedStatement = connection.prepareStatement(QuerrySQLSelect);
            ResultSet resultSet = preparedStatement.executeQuery(QuerrySQLSelect);

            while(resultSet.next()){

                PessoaFisica pessoaDoBanco = new PessoaFisica( resultSet.getString("Nome"), resultSet.getInt("Idade"), resultSet.getString("CPF"));
                listaDoBanco.add(pessoaDoBanco);
            }
            return listaDoBanco;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    public static void registraNoBanco(PessoaFisica pessoaF){

        try{

            String QuerrySQLInsert = "insert into people" + "(Nome, Idade, CPF)" + "VALUES (?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(QuerrySQLInsert);

            preparedStatement.setString(1, pessoaF.getNome());
            preparedStatement.setInt(2, pessoaF.getIdade());
            preparedStatement.setString(3, pessoaF.getCpf());

            preparedStatement.execute();
            preparedStatement.close();

        }catch (SQLException throwables){

            throwables.printStackTrace();

        }




    }

}

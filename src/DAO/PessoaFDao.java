package DAO;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PessoaFDao {

    private static Connection connection;
    private static String QuerrySQL = "select * from people";

    public PessoaFDao() {

        this.connection = ConnectionFactory.getConnection();

    }

    public static void mostraDadosBanco(){

        try{

            PreparedStatement preparedStatement = connection.prepareStatement(QuerrySQL);
            ResultSet resultSet = preparedStatement.executeQuery(QuerrySQL);

            while(resultSet.next()){

                System.out.println(resultSet.getString("firstname"));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}

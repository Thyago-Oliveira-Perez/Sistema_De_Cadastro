package DAO;

import java.net.ConnectException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class ConnectionFactory {

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/thyaguinho", "root", "1234");
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}

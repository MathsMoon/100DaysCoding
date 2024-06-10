package Curso_Dojo.JDBC.Introduction.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3305/loja_manga";
        String username = "root";
        String password = "root";

        return DriverManager.getConnection(url, username, password);
    }
}
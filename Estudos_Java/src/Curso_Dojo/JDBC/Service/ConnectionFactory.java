package Curso_Dojo.JDBC.Service;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
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

    public static JdbcRowSet getJdbcRowSet() throws SQLException {
        String url = "jdbc:mysql://localhost:3305/loja_manga";
        String username = "root";
        String password = "root";
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl(url);
        rowSet.setUsername(username);
        rowSet.setPassword(password);
        return rowSet;
    }
}
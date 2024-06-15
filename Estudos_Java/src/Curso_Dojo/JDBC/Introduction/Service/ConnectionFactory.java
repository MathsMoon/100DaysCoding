package Curso_Dojo.JDBC.Introduction.Service;

import javax.sql.rowset.CachedRowSet;
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

        JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet();

        jrs.setUrl(url);
        jrs.setUsername(username);
        jrs.setPassword(password);

        return jrs;
    }

    public static CachedRowSet getCachedRowSet() throws SQLException {
        return RowSetProvider.newFactory().createCachedRowSet();
    }
}
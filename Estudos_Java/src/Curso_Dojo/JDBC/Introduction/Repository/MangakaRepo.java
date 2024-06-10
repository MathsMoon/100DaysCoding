package Curso_Dojo.JDBC.Introduction.Repository;

import Curso_Dojo.JDBC.Introduction.Dominio.Mangaka;
import Curso_Dojo.JDBC.Introduction.Service.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MangakaRepo {
    public static void save(Mangaka mangaka){
        String sql = "INSERT INTO `loja_manga`.`mangaka` (`mangakaname`) VALUES ('%s');".formatted(mangaka.getName());
        try(Connection con = ConnectionFactory.getConnection();
            Statement stmt = con.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
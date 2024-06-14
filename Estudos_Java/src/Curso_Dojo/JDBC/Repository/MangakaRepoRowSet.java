package Curso_Dojo.JDBC.Repository;

import Curso_Dojo.JDBC.Dominio.Mangaka;
import Curso_Dojo.JDBC.Listener.CustomRowSetListener;
import Curso_Dojo.JDBC.Service.ConnectionFactory;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MangakaRepoRowSet {
    public static List<Mangaka> findByNameRowSet(String name){
        String sql = "SELECT * FROM loja_manga.mangaka where mangakaName like ?;";
        List<Mangaka> mangakaList = new ArrayList<>();
        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%",name));
            jrs.execute();
            while (jrs.next()){
                extracted(jrs, mangakaList);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return mangakaList;
    }
//    Ocorre o erro de update, devido ao execute não ser também Updatable.
//    public static void updateRowSet(Mangaka mangaka){
//        String sql = "UPDATE `loja_manga`.`mangaka` SET `mangakaName` = ? WHERE (`idmangaka` = ?)";
//        List<Mangaka> mangakaList = new ArrayList<>();
//        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
//            jrs.setCommand(sql);
//            jrs.setString(1, mangaka.getName());
//            jrs.setInt(2, mangaka.getId());
//            jrs.execute();
//        }catch (SQLException e){
//            throw new RuntimeException(e);
//        }
//    }

    public static void updateRowSet(Mangaka mangaka){
        String sql = "SELECT * FROM loja_manga.mangaka WHERE (`idmangaka` = ?)";
        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, mangaka.getId());
            jrs.execute();
            if(!jrs.next()) return;
            jrs.updateString("mangakaName", mangaka.getName());
            jrs.updateRow();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void updateCachedRowSet(Mangaka mangaka){
        String sql = "SELECT * FROM loja_manga.mangaka WHERE (`idmangaka` = ?)";
        try(CachedRowSet crs = ConnectionFactory.getCachedRowSet()){
            crs.addRowSetListener(new CustomRowSetListener());
            crs.setCommand(sql);
            crs.setInt(1, mangaka.getId());
            crs.execute();
            if(!crs.next()) return;
            crs.updateString("mangakaName", mangaka.getName());
            crs.updateRow();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    private static void extracted(JdbcRowSet jrs, List<Mangaka> mangakaList) throws SQLException {
        Mangaka mangaka = Mangaka.builder().Name(jrs.getString("mangakaName")).id(jrs.getInt("idmangaka")).build();
        mangakaList.add(mangaka);
    }
}
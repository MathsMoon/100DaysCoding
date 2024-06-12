package Curso_Dojo.JDBC.Introduction.Repository;

import Curso_Dojo.JDBC.Introduction.Dominio.Mangaka;
import Curso_Dojo.JDBC.Introduction.Service.ConnectionFactory;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
    A classe de MangakaRepo funciona como a ponte
    entre a pesquisa que realizamos no Test e o banco
    de dados, devido a nesta classe estar contidas
    os métodos e funções necessárias para realizarmos
    um CRUD básico com Banco de dados, manipulando
    as informações.
*/

@Log4j2
public class MangakaRepo {
    public static void save(Mangaka mangaka){
        String sql = "INSERT INTO `loja_manga`.`mangaka` (`mangakaname`) VALUES ('%s');".formatted(mangaka.getName());
        try(Connection con = ConnectionFactory.getConnection();
            Statement stmt = con.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Database rows Affected '{}'", rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert mangaka '{}'", mangaka.getName(), e);
        }
    }

    public static void delete(int ID){
        String sql = "DELETE FROM `loja_manga`.`mangaka` WHERE (`idmangaka` = '%d')".formatted(ID);
        try(Connection con = ConnectionFactory.getConnection();
            Statement stmt = con.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Database rows deleted '{}'", rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete mangaka '{}'", ID, e);
        }
    }

    public static void update(Mangaka mangaka){
        String sql = "UPDATE `loja_manga`.`mangaka` SET `mangakaName` = '%s' WHERE (`idmangaka` = '%d')".formatted(mangaka.getName(), mangaka.getId());
        try(Connection con = ConnectionFactory.getConnection();
            Statement stmt = con.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Database rows updated '{}'", rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update mangaka '{}'", mangaka.getId(), e);
        }
    }

    /*
        Devido a proximidade dos códigos entre o FindByName e o Find All.
        poderíamos simplesmente substituir o Findall pelo
        findByName(""), que retorna todos os valores dentro da tabela pesquisada.
     */

    public static List<Mangaka> findAll(){
        String sql = "SELECT idmangaka, mangakaName FROM loja_manga.mangaka;";
        List<Mangaka> mangakaList = new ArrayList<>();
        log.info("Fiding all Mangakas");

        try(Connection con = ConnectionFactory.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()){
                Mangaka mangaka = Mangaka.
                        builder().
                        Name(rs.getString("mangakaName")).
                        id(rs.getInt("idmangaka")).
                        build();
                mangakaList.add(mangaka);
            }
        } catch (SQLException e) {
            log.error("Error Trying to get the Mangaka list", e);
        }
        return mangakaList;
    }

    public static List<Mangaka> findByName(String name){
        String sql = "SELECT * FROM loja_manga.mangaka where mangakaName like '%%%s%%';".formatted(name);
        List<Mangaka> mangakaList = new ArrayList<>();
        log.info("Fiding Mangaka by Name");

        try(Connection con = ConnectionFactory.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()){
                Mangaka mangaka = Mangaka.
                        builder().
                        Name(rs.getString("mangakaName")).
                        id(rs.getInt("idmangaka")).
                        build();
                mangakaList.add(mangaka);
            }
        } catch (SQLException e) {
            log.error("Error Trying to get the Mangaka list", e);
        }
        return mangakaList;
    }

    public static void getMangakaMetaData(){
        String sql = "SELECT * FROM loja_manga.mangaka;";
        log.info("showing Mangaka MetaData");

        try(Connection con = ConnectionFactory.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            log.info("Columns count '{}'", columnCount);

            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name: '{}'", metaData.getCatalogName(i));
                log.info("Column name: '{}'", metaData.getColumnName(i));
                log.info("Column size: '{}'", metaData.getColumnDisplaySize(i));
                log.info("Column type: '{}'", metaData.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            log.error("Error Trying to get the Mangaka name", e);
        }
    }

    public static void getDriverMetaData(){
        log.info("showing Driver MetaData");
        try(Connection con = ConnectionFactory.getConnection()){
            DatabaseMetaData metaData = con.getMetaData();
            if(metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                log.info("Supports TYPE_FORWARD_ONLY.");

                if(metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
                    log.info("TFO And Supports CONCUR_UPDATABLE");
                }
            }

            if(metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                log.info("Supports TYPE_SCROLL_INSENSITIVE.");

                if(metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("TSI And Supports CONCUR_UPDATABLE");
                }
            }

            if(metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                log.info("Supports TYPE_SCROLL_INSENSITIVE.");

                if(metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("TSS And Supports CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Error Trying to get the Mangaka name", e);
        }
    }

    public static void showTypeScrollWorking(){
        String sql = "SELECT * FROM loja_manga.mangaka;";
        try(Connection con = ConnectionFactory.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql)) {
            //Procurando o último item da lista de acordo com a pesquisa do sql.
            log.info("Last row? '{}'",rs.last());
            log.info("Row number '{}'",rs.getRow());
            log.info(Mangaka.builder().Name(rs.getString("mangakaName")).id(rs.getInt("idmangaka")).build());

            //Procurando o primeiro item da lista de acordo com a pesquisa do sql.
            log.info("First row? '{}'",rs.first());
            log.info("Row number '{}'",rs.getRow());
            log.info(Mangaka.builder().Name(rs.getString("mangakaName")).id(rs.getInt("idmangaka")).build());

            //Procurando o linha especifíca da lista de acordo com a pesquisa sql.
            log.info("Absolute row? '{}'",rs.absolute(4)); //Especificando a linha 4.
            log.info("Row number '{}'",rs.getRow());
            log.info(Mangaka.builder().Name(rs.getString("mangakaName")).id(rs.getInt("idmangaka")).build());

            //Procurando o item anterior ao último relatado de uma pesquisa.
            log.info("Relative row? '{}'",rs.last());
            log.info("Row number '{}'",rs.getRow());
            log.info(Mangaka.builder().Name(rs.getString("mangakaName")).id(rs.getInt("idmangaka")).build());

            //Retorna se o valor que o ponteiro está é o último item da lista.
            log.info("Is last row? '{}'",rs.isLast());
            log.info("Row number '{}'",rs.getRow());

        } catch (SQLException e) {
            log.error("Error Trying to get the showTypeScrollWorking", e);
        }
    }

    public static List<Mangaka> findByNameAndUpdateToUpperCase(String name){
        String sql = "SELECT * FROM loja_manga.mangaka where mangakaName like '%%%s%%';".formatted(name);
        List<Mangaka> mangakaList = new ArrayList<>();
        log.info("Fiding Mangaka by Name to put UpperCase");

        try(Connection con = ConnectionFactory.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()){
                rs.updateString("mangakaName", rs.getString("mangakaName").toUpperCase());
                rs.updateRow();
                Mangaka mangaka = Mangaka.
                        builder().
                        Name(rs.getString("mangakaName")).
                        id(rs.getInt("idmangaka")).
                        build();
                mangakaList.add(mangaka);
            }
        } catch (SQLException e) {
            log.error("Error Trying to get the Mangaka list", e);
        }
        return mangakaList;
    }

    public static List<Mangaka> findByNameAndInsertWhenNotFound(String name){
        String sql = "SELECT * FROM loja_manga.mangaka where mangakaName like '%%%s%%';".formatted(name);
        List<Mangaka> mangakaList = new ArrayList<>();
        log.info("Fiding Mangaka to insert");

        try(Connection con = ConnectionFactory.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql)) {
            if(rs.next()) {return mangakaList;}
            InsertNewProducer(name, rs);
            mangakaList.add(getMangaka(rs));
        } catch (SQLException e) {
            log.error("Error Trying to get the Mangaka list", e);
        }
        return mangakaList;
    }

    private static void InsertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("mangakaName", name);
        rs.insertRow();
    }

    private static Mangaka getMangaka(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        return Mangaka.builder().Name(rs.getString("mangakaName")).id(rs.getInt("idmangaka")).build();
    }
}
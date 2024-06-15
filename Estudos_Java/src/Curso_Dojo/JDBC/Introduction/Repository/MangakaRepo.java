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

    public static void saveTransaction(List<Mangaka> mangakas){
        try(Connection con = ConnectionFactory.getConnection()) {
            con.setAutoCommit(false);
            preparedeStatementSaveTransaction(con, mangakas);
            con.commit();
        } catch (SQLException e) {
            log.error("Error while trying to save mangakas '{}'", mangakas, e);
        }
    }

    private static void preparedeStatementSaveTransaction(Connection con,List<Mangaka> mangakas) throws SQLException {
        String sql = "INSERT INTO `loja_manga`.`mangaka` (`mangakaname`) VALUES (?)";
        boolean shouldRollBack = false;
        for(Mangaka mg: mangakas){
            try (PreparedStatement ps = con.prepareStatement(sql)){
                log.info("Saving Mangakas '{}'", mg.getName());
                ps.setString(1, mg.getName());
                ps.execute();
            } catch (SQLException e){
                shouldRollBack = true;
                throw new RuntimeException(e);
            }
        }
        if (shouldRollBack) con.rollback();
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

    public static void updateWithPreparedStatement(Mangaka mangaka){
        try(Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = updatePreparedeStatement(con, mangaka)) {
            int rowsAffected = ps.executeUpdate();
            log.info("Database rows updated with PreparedStatement '{}'", rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update mangaka '{}'", mangaka.getId(), e);
        }
    }

    private static PreparedStatement updatePreparedeStatement(Connection con, Mangaka mangaka) throws SQLException {
        String sql = "UPDATE `loja_manga`.`mangaka` SET `mangakaName` = ? WHERE (`idmangaka` = ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, mangaka.getName());
        ps.setInt(2, mangaka.getId());
        return ps;
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
                extracted(rs, mangakaList);
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
                extracted(rs, mangakaList);
            }
        } catch (SQLException e) {
            log.error("Error Trying to get the Mangaka list", e);
        }
        return mangakaList;
    }

    public static List<Mangaka> findByNamePrepareStatement(String name){
        List<Mangaka> mangakaList = new ArrayList<>();
        log.info("Fiding Mangaka by Name with Prepare Statement");

        try(Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = createdPreparedStatement(con, name);
            ResultSet rs = ps.executeQuery()) {
            while (rs.next()){
                extracted(rs, mangakaList);
            }
        } catch (SQLException e) {
            log.error("Error Trying to get the Mangaka list", e);
        }
        return mangakaList;
    }

    private static PreparedStatement createdPreparedStatement(Connection con,String name) throws SQLException {
        String sql = "SELECT * FROM loja_manga.mangaka where mangakaName like ?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, name);
        return ps;
    }

    public static List<Mangaka> findByNameCallableStatement(String name){
        List<Mangaka> mangakaList = new ArrayList<>();
        log.info("Fiding Mangaka by Name with Callable Statement");

        try(Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = createdCallableStatement(con, name);
            ResultSet rs = ps.executeQuery()) {
            while (rs.next()){
                extracted(rs, mangakaList);
            }
        } catch (SQLException e) {
            log.error("Error Trying to get the Mangaka list", e);
        }
        return mangakaList;
    }

    private static CallableStatement createdCallableStatement(Connection con,String name) throws SQLException {
        String sql = "CALL 'loja_manga'.'sp_get_by_name'(?);";
        CallableStatement cs = con.prepareCall(sql);
        cs.setString(1, name);
        return cs;
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
                extracted(rs, mangakaList);
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
            if(rs.next()) {
                extracted(rs, mangakaList);
                return mangakaList;}
            InsertNewProducer(name, rs);
            mangakaList.add(getMangaka(rs));
        } catch (SQLException e) {
            log.error("Error Trying to get the Mangaka list", e);
        }
        return mangakaList;
    }

    private static void extracted(ResultSet rs, List<Mangaka> mangakaList) throws SQLException {
        Mangaka mangaka = Mangaka.builder().
                Name(rs.getString("mangakaName")).
                id(rs.getInt("idmangaka")).
                build();
        mangakaList.add(mangaka);
    }

    public static void findByNameAndDelete(String name){
        String sql = "SELECT * FROM loja_manga.mangaka where mangakaName like '%%%s%%';".formatted(name);
        log.info("Fiding Mangaka to delete");
        try(Connection con = ConnectionFactory.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()){
                log.info("Mangaka '{}' deleted", rs.getString("mangakaName"));
                rs.deleteRow();
            }
        } catch (SQLException e) {
            log.error("Error Trying to get the Mangaka list", e);
        }
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
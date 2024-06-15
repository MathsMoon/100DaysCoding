package Curso_Dojo.JDBC.CRUD.Repository;

import Curso_Dojo.JDBC.CRUD.Connection.ConnectionFactory;
import Curso_Dojo.JDBC.CRUD.Dominio.Aluno;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AlunoRepository {
    public static void save(Aluno aluno){
        log.info("Saving student to database");
        try(Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = createPreparedStatementSave(con, aluno)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to save student '{}'", aluno.getID_Aluno(), e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection con, Aluno aluno) throws SQLException {
        String sql = "INSERT INTO `mydb`.`aluno` (`nome_aluno`, `endereco_aluno`, `telefone_aluno`, `situacao_aluno`) VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, aluno.getNome_Aluno());
        ps.setString(2, aluno.getEndereco_Aluno());
        ps.setString(3, aluno.getTelefone_Aluno());
        ps.setString(4, aluno.getSituacao_Aluno());
        return ps;
    }

    //Refazer a Pesquisa para Acessar o Banco todo ou apenas um nome em específico.
    public static List<Aluno> findByName(String name){
        List<Aluno> alunos = new ArrayList<>();
        log.info("Searching student by Name");
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createdPreparedStatement(conn, name);
             ResultSet rs = ps.executeQuery()){ //Rever ExecuteQuery
            while (rs.next()){
             extracted(rs, alunos);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return alunos;
    }

    private static PreparedStatement createdPreparedStatement(Connection con, String name) throws SQLException {
        String sql = "SELECT * FROM mydb.aluno where nome_aluno like ?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, name);
        return ps;
    }

    public static Optional<Aluno> findByID(Integer ID){
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createdPreparedStatementFidingByID(conn, ID);
             ResultSet rs = ps.executeQuery()){ //Rever ExecuteQuery
            if(!rs.next()) return Optional.empty();
            return Optional.of(Aluno.builder().
                    ID_Aluno(rs.getInt("id_aluno")).
                    nome_Aluno(rs.getString("nome_aluno")).
                    endereco_Aluno(rs.getString("endereco_aluno")).
                    telefone_Aluno(rs.getString("telefone_aluno")).
                    situacao_Aluno(rs.getString("situacao_aluno")).
                    build());
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createdPreparedStatementFidingByID(Connection con, Integer ID) throws SQLException {
        String sql = "SELECT * FROM mydb.aluno where id_aluno like ?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ID);
        return ps;
    }


    public static void update(Aluno aluno){
        log.info("Updating Student '{}'", aluno);
        try(Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = updatePreparedeStatement(con, aluno)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update student '{}'", aluno.getID_Aluno(), e);
        }
    }

    private static PreparedStatement updatePreparedeStatement(Connection con, Aluno aluno) throws SQLException {
        String sql = "UPDATE mydb.aluno SET nome_aluno = ? WHERE (`id_aluno` = ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, aluno.getNome_Aluno());
        ps.setInt(2, aluno.getID_Aluno());
        return ps;
    }

    public static void delete(int ID){
        try(Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = createdPreparedStatementDelete(con, ID)) {
            ps.execute();
            log.info("Deleting student '{}' from the database.", ID);
        } catch (SQLException e) {
            log.error("Error while trying to delete student '{}'", ID, e);
        }
    }

    private static PreparedStatement createdPreparedStatementDelete(Connection con, int ID) throws SQLException {
        String sql = "DELETE FROM mydb.aluno WHERE (`id_aluno` = ?);";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ID);
        return ps;
    }

    private static void extracted(ResultSet rs, List<Aluno> alunos) throws SQLException {
        Aluno aluno = Aluno.builder().
                ID_Aluno(rs.getInt("id_aluno")).
                nome_Aluno(rs.getString("nome_aluno")).
                endereco_Aluno(rs.getString("endereco_aluno")).
                telefone_Aluno(rs.getString("telefone_aluno")).
                situacao_Aluno(rs.getString("situacao_aluno")).
                build();

        alunos.add(aluno);
    }
}
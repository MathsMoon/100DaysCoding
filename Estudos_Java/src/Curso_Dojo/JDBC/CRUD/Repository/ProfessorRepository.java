package Curso_Dojo.JDBC.CRUD.Repository;

import Curso_Dojo.JDBC.CRUD.Connection.ConnectionFactory;
import Curso_Dojo.JDBC.CRUD.Dominio.Professor;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProfessorRepository {
    public static void save(Professor professor){
        log.info("Saving teacher to database");
        try(Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = createPreparedStatementSave(con, professor)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to save teacher '{}'", professor.getID_Professor(), e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection con, Professor professor) throws SQLException {
        String sql = "INSERT INTO `mydb`.`professor` (`nome_professor`, `endereco_professor`, `telefone_professor`) VALUES (?,?,?);";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, professor.getNome_Professor());
        ps.setString(2, professor.getEndereco_Professor());
        ps.setString(3, professor.getTelefone_Professor());
        return ps;
    }

    //Refazer a Pesquisa para Acessar o Banco todo ou apenas um nome em específico.
    public static List<Professor> findByName(String name){
        List<Professor> professors = new ArrayList<>();
        log.info("Searching teacher by Name");
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createdPreparedStatement(conn, name);
             ResultSet rs = ps.executeQuery()){ //Rever ExecuteQuery
            while (rs.next()){
             extracted(rs, professors);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return professors;
    }

    private static PreparedStatement createdPreparedStatement(Connection con, String name) throws SQLException {
        String sql = "SELECT * FROM mydb.professor where nome_professor like ?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, name);
        return ps;
    }

    public static Optional<Professor> findByID(Integer ID){
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createdPreparedStatementFidingByID(conn, ID);
             ResultSet rs = ps.executeQuery()){ //Rever ExecuteQuery
            if(!rs.next()) return Optional.empty();
            return Optional.of(Professor.builder().
                    ID_Professor(rs.getInt("id_professor")).
                    nome_Professor(rs.getString("nome_professor")).
                    endereco_Professor(rs.getString("endereco_professor")).
                    telefone_Professor(rs.getString("telefone_professor")).
                    build());
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createdPreparedStatementFidingByID(Connection con, Integer ID) throws SQLException {
        String sql = "SELECT * FROM mydb.professor where id_professor like ?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ID);
        return ps;
    }


    public static void update(Professor professor){
        log.info("Updating Student '{}'", professor);
        try(Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = updatePreparedeStatement(con, professor)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update teacher '{}'", professor.getID_Professor(), e);
        }
    }

    private static PreparedStatement updatePreparedeStatement(Connection con, Professor professor) throws SQLException {
        String sql = "UPDATE mydb.professor SET nome_professor = ? WHERE (`id_professor` = ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, professor.getNome_Professor());
        ps.setInt(2, professor.getID_Professor());
        return ps;
    }

    public static void delete(int ID){
        try(Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = createdPreparedStatementDelete(con, ID)) {
            ps.execute();
            log.info("Deleting teacher '{}' from the database.", ID);
        } catch (SQLException e) {
            log.error("Error while trying to delete teacher '{}'", ID, e);
        }
    }

    private static PreparedStatement createdPreparedStatementDelete(Connection con, int ID) throws SQLException {
        String sql = "DELETE FROM mydb.professor WHERE (`id_professor` = ?);";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ID);
        return ps;
    }

    private static void extracted(ResultSet rs, List<Professor> professors) throws SQLException {
        Professor professor = Professor.builder().
                ID_Professor(rs.getInt("id_professor")).
                nome_Professor(rs.getString("nome_professor")).
                endereco_Professor(rs.getString("endereco_professor")).
                telefone_Professor(rs.getString("telefone_professor")).
                build();

        professors.add(professor);
    }
}
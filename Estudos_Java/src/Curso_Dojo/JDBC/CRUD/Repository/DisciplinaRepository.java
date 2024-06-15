package Curso_Dojo.JDBC.CRUD.Repository;

import Curso_Dojo.JDBC.CRUD.Connection.ConnectionFactory;
import Curso_Dojo.JDBC.CRUD.Dominio.Disciplina;
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
public class DisciplinaRepository {
    public static void save(Disciplina disciplina){
        log.info("Saving disciplina to database");
        try(Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = createPreparedStatementSave(con, disciplina)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to save disciplina '{}'", disciplina.getID_disciplina(), e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection con, Disciplina disciplina) throws SQLException {
        String sql = "INSERT INTO `mydb`.`disciplina` (`nome_disciplina`, `descricao_disciplina`, `carga_horaria`, `ementa_disciplina`, `bibliografia_disciplina`, `Professor_disciplina`) VALUES (?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, disciplina.getNome_disciplina());
        ps.setString(2, disciplina.getDescricao_disciplina());
        ps.setInt(3, disciplina.getCarga_horaria());
        ps.setString(4, disciplina.getEmenta_disciplina());
        ps.setString(5, disciplina.getBibliografia_disciplina());
        ps.setString(6, disciplina.getProfessor().getNome_Professor());
        return ps;
    }

    //Refazer a Pesquisa para Acessar o Banco todo ou apenas um nome em específico.
    public static void findByName(String name){
       try (Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = createdPreparedStatement(con, name);
            ){

       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
    }

    private static Professor extractedProf(ResultSet rs) throws SQLException {
        return Professor.builder().
                nome_Professor(rs.getString("nome_professor")).
                ID_Professor(rs.getInt("id_Professor")).
                build();
    }

    private static PreparedStatement createdPreparedStatement(Connection con, String name) throws SQLException {
        String sql = """
        Select a.id_Disciplina, a.nome_disciplina, p.id_professor ,a.Professor_disciplina from mydb.disciplina a inner join
        mydb.professor p on a.Professor_disciplina = p.id_Professor where a.nome_disciplina like ?;\s
       \s""";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, name);
        return ps;
    }

    public static Optional<Disciplina> findByID(Integer ID){
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createdPreparedStatementFidingByID(conn, ID);
             ResultSet rs = ps.executeQuery()){ //Rever ExecuteQuery
            if(!rs.next()) return Optional.empty();
            return Optional.of(Disciplina.builder().
                    nome_disciplina(rs.getString("nome_disciplina")).
                    descricao_disciplina(rs.getString("descricao_disciplina")).
                    carga_horaria(rs.getInt("carga_horaria")).
                    ementa_disciplina(rs.getString("ementa_disciplina")).
                    bibliografia_disciplina(rs.getString("bibliografia_disciplina")).
                    professor(extractedProf(rs)).
                    build());
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createdPreparedStatementFidingByID(Connection con, Integer ID) throws SQLException {
        String sql = """
        Select a.id_Disciplina, a.nome_disciplina, p.id_professor ,a.Professor_disciplina from mydb.disciplina a inner join
        mydb.professor p on a.Professor_disciplina = p.id_Professor where a.id_Disciplina = ?;\s
       \s""";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ID);
        return ps;
    }


    public static void update(Disciplina disciplina){
        log.info("Updating disciplina '{}'", disciplina);
        try(Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = updatePreparedeStatement(con, disciplina)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update disciplina '{}'", disciplina.getID_disciplina(), e);
        }
    }

    private static PreparedStatement updatePreparedeStatement(Connection con, Disciplina disciplina) throws SQLException {
        String sql = "UPDATE mydb.disciplina SET nome_disciplina = ? WHERE (`id_disciplina` = ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, disciplina.getNome_disciplina());
        ps.setInt(2, disciplina.getID_disciplina());
        return ps;
    }

    public static void delete(int ID){
        try(Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = createdPreparedStatementDelete(con, ID)) {
            ps.execute();
            log.info("Deleting disciplina '{}' from the database.", ID);
        } catch (SQLException e) {
            log.error("Error while trying to delete disciplina '{}'", ID, e);
        }
    }

    private static PreparedStatement createdPreparedStatementDelete(Connection con, int ID) throws SQLException {
        String sql = "DELETE FROM mydb.disciplina WHERE (`id_disciplina` = ?);";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ID);
        return ps;
    }

    private static void extracted(ResultSet rs, List<Disciplina> disciplinas, Professor professor) throws SQLException {
        Disciplina disciplina = Disciplina.builder().
                ID_disciplina(rs.getInt("id_disciplina")).
                nome_disciplina(rs.getString("nome_disciplina")).
                descricao_disciplina(rs.getString("descricao_disciplina")).
                carga_horaria(rs.getInt("carga_horaria")).
                ementa_disciplina(rs.getString("ementa_disciplina")).
                bibliografia_disciplina(rs.getString("bibliografia_disciplina")).
                professor(professor).
                build();

        disciplinas.add(disciplina);
    }
}
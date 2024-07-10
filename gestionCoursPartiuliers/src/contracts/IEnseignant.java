package contracts;
import models.Enseignant;
import java.sql.SQLException;
import java.util.List;

public interface IEnseignant{

    List<Enseignant> getAllEnseignants() throws SQLException;


    Enseignant getEnseignantById(int id) throws SQLException;


    void saveEnseignant(Enseignant enseignant) throws SQLException;


    void updateEtudiant(Enseignant etudiant) throws SQLException;


    void deleteEtudiant(int id) throws SQLException;
}

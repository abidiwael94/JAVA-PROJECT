package contracts;
import models.Matiere;
import java.sql.SQLException;
import java.util.List;

public interface IMatiere {

    List<Matiere> getAllMatieres() throws SQLException;


    Matiere getMatiereById(int id) throws SQLException;


    void saveMatiere(Matiere matiere) throws SQLException;


    void updateatiere(Matiere matiere) throws SQLException;


    void deleteMatiere(int id) throws SQLException;
}

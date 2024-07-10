package contracts;
import models.Groupe;
import java.sql.SQLException;
import java.util.List;

public interface IGroupe {

    //id_enseignant , id_matiere

    List<Groupe> getAllGroupes() throws SQLException;


    Groupe geGroupeById(int id_enseignant,int id_matiere) throws SQLException;


    void saveGroupe(Groupe groupe) throws SQLException;


    void updateGroupe(Groupe groupe) throws SQLException;


    void deleteGroupe(int id_enseignat,int id_matiere) throws SQLException;

    // void findAbsenceByStudent , void findAbsenceBySeance , bygroupe, ??

}

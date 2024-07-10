package contracts;
import models.Absence;
import java.sql.SQLException;
import java.util.List;

public interface IAbsence {

    List<Absence> getAllAbsences() throws SQLException;


    Absence geAbsenceById(int id) throws SQLException;


    void saveAbsence(Absence absence) throws SQLException;


    void updateAbsence(Absence absence) throws SQLException;


    void deleteAbsence(int id) throws SQLException;

    // void findAbsenceByStudent , void findAbsenceBySeance , bygroupe, ??

}

package contracts;
import models.Admin;
import java.sql.SQLException;
import java.util.List;

public interface IAdmin{

    List<Admin> getAllAdmin() throws SQLException;


    Admin getAdminById(int id) throws SQLException;


    void saveAdmin(Admin admin) throws SQLException;


    void updateAdmin(Admin admin) throws SQLException;

    void deleteAdmin(int id) throws SQLException;
}

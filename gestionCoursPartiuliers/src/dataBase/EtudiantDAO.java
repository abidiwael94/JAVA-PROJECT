package dataBase;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import contracts.IEtudiant;
import models.Etudiant;

public class EtudiantDAO implements IEtudiant {

    private  Connection connection;

    public EtudiantDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Etudiant> getAllEtudiants() throws SQLException {
        List<Etudiant> etudiants = new ArrayList<>();
        String query = "SELECT * FROM etudiant";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String email = resultSet.getString("eamil"); // Assuming a typo in the schema
                String nom = resultSet.getString("nom");
                String prenom = resultSet.getString("prenom");

                Etudiant etudiant = new Etudiant(email, nom, prenom);
                etudiants.add(etudiant);
            }
        }
        return etudiants;
    }

    @Override
    public Etudiant getEtudiantById(int id) throws SQLException {
        String query = "SELECT * FROM etudiant WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query);) {
            preparedStatement.setInt(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    String email = resultSet.getString("eamil"); // Assuming a typo in the schema
                    String nom = resultSet.getString("nom");
                    String prenom = resultSet.getString("prenom");

                    return new Etudiant(email, nom, prenom);
                } else {
                    return null;
                }
            }
        }
    }

    @Override
    public void saveEtudiant(Etudiant etudiant) throws SQLException {
        String query = "INSERT INTO etudiant (eamil, nom, prenom) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, etudiant.getEmail());
            preparedStatement.setString(2, etudiant.getNom());
            preparedStatement.setString(3, etudiant.getPrenom());

            preparedStatement.executeUpdate();
        }
    }


    @Override
    public void updateEtudiant(Etudiant etudiant) throws SQLException {
        String query = "UPDATE etudiant SET eamil = ?, nom = ?, prenom = ? WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, etudiant.getEmail());
            preparedStatement.setString(2, etudiant.getNom());
            preparedStatement.setString(3, etudiant.getPrenom());
            preparedStatement.setInt(4, etudiant.getId());

            preparedStatement.executeUpdate();
        }
    }

    @Override
    public void deleteEtudiant(int id) throws SQLException {
        String query = "DELETE FROM etudiant WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
        }
    }
}

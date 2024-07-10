package models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;


public class Seance {


    private LocalDate date_seance;
    private LocalTime heure_debut;
    //relations
    private Salle salle ;
    private Groupe groupe ;
    private ArrayList<Absence> absences;


    public Seance(LocalDate date_seance, LocalTime heure_debut, Salle salle, Groupe groupe) {
        this.date_seance = date_seance;
        this.heure_debut = heure_debut;
        this.salle = salle;
        this.groupe = groupe;
    }

    public LocalDate getDate_seance() {
        return date_seance;
    }

    public void setDate_seance(LocalDate date_seance) {
        this.date_seance = date_seance;
    }

    public LocalTime getHeure_debut() {
        return heure_debut;
    }

    public void setHeure_debut(LocalTime heure_debut) {
        this.heure_debut = heure_debut;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public ArrayList<Absence> getAbsences() {
        return absences;
    }

    public void setAbsences(ArrayList<Absence> absences) {
        this.absences = absences;
    }

    public void addAbsence(Absence absence) {
            this.absences.add(absence);
        }

    public void removeAbsence(Absence absence) {
          this.absences.remove(absence);
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seance seance = (Seance) o;
        return Objects.equals(date_seance, seance.date_seance) && Objects.equals(heure_debut, seance.heure_debut) && Objects.equals(salle, seance.salle) && Objects.equals(groupe, seance.groupe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date_seance, heure_debut, salle, groupe);
    }

    @Override
    public String toString() {
        return "models.Seance{" +
                "date_seance=" + date_seance +
                ", heure_debut=" + heure_debut +
                ", salle=" + salle +
                ", groupe=" + groupe +
                '}';
    }
}
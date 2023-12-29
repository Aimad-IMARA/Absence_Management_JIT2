package com.absenceManagement.entities;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Seance {
    private String id;
    private List<Etudiant> etudiantsPresents;
    private LocalDate date;

    public Seance(String id,
                  List<Etudiant> etudiantsPresents,
                  LocalDate date){
        this.id  = id;
        this.etudiantsPresents = etudiantsPresents;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public List<Etudiant> getEtudiantsPresents() {
        return etudiantsPresents;
    }

    public LocalDate getDate() {
        return date;
    }
}

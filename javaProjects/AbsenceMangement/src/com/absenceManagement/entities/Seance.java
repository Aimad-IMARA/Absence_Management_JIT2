package com.absenceManagement.modules;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

public class Seance {
    private String id;
    private ArrayList<Etudiant> etudiantsPresents;
    private String date;

    public Seance(String id,
                  ArrayList<Etudiant> etudiantsPresents,
                  String date){
        this.id  = id;
        this.etudiantsPresents = etudiantsPresents;
        this.date = date;
    }

    public String getId() {
        return id;
    }

}

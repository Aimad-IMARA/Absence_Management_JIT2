package com.students;

import java.util.UUID;

public abstract class Student {
    private final String id;
    private final String nom;
    private final String prenom;

    private final String option;

    public Student(String nom, String prenom) {
        this.id = UUID.randomUUID().toString();;
        this.prenom = prenom;
        this.nom = nom;
        this.option = createOption();
    }
    public String getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getOption() {
        return "I'm in the class: " + option;
    }

    abstract String createOption();

}

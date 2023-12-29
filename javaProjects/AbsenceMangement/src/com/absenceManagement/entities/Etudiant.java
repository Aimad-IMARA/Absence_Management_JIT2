package com.absenceManagement.entities;

public class Etudiant {
    private int age;
    private String id;
    private String name;
    public Etudiant(String id,String name,int age){
        this.age=age;
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

}

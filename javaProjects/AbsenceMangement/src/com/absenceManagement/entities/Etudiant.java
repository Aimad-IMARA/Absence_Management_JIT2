package com.absenceManagement.modules;

public class Etudiant {
    private int age;
    private String id;
    private String name;
    private String type;
    public Etudiant(String id,String name,int age,String type){
        this.age=age;
        this.id=id;
        this.name=name;
        this.type=type;
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

    public String getType() {
        return type;
    }
}

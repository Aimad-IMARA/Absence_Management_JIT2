package com.students;

public class StudentJava extends Student{
    public StudentJava(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public String createOption() {
        return "JAVA";
    }
    
}

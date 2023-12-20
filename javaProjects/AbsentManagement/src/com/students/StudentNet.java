package com.students;

public class StudentNet extends Student{
    public StudentNet(String nom, String prenom) {
        super(nom, prenom);
    }
    @Override
    String createOption() {
        return ".NET";
    }
}

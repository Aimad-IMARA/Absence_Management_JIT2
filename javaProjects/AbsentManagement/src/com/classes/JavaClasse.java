package com.classes;

import com.students.StudentDotNet;
import com.students.StudentJava;

import java.util.ArrayList;

public class JavaClasse implements IClasse{
    private final ArrayList<StudentJava> students;
    public JavaClasse(ArrayList<StudentJava> javaStudents){
        students = javaStudents;
    }

    public ArrayList<StudentJava> getStudents() {
        return students;
    }

    @Override
    public int numberOfStudents() {
        return students.size();
    }
}

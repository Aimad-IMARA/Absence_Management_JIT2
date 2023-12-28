package com.classes;

import com.students.StudentDotNet;

import java.util.ArrayList;

public class DotNetClasse implements IClasse{
    private final ArrayList<StudentDotNet> students;
    public DotNetClasse(ArrayList<StudentDotNet> dotNetStudents){
        students = dotNetStudents;
    }

    public ArrayList<StudentDotNet> getStudents() {
        return students;
    }

    @Override
    public int numberOfStudents() {
        return students.size();
    }
}

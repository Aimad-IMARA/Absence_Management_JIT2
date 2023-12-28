package com.factory;

import com.students.Student;
import com.students.StudentJava;

public class StudentJavaFactory implements IStudentFactory {
    @Override
    public Student createStudent(String name,String lastName){
        return new StudentJava(name,lastName);
    }
}

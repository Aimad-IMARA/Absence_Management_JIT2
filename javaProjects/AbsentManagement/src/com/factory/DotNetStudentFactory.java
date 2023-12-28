package com.factory;

import com.students.Student;
import com.students.StudentDotNet;

public class StudentDotNetFactory implements IStudentFactory {
    @Override
    public Student createStudent(String name,String lastName) {
        return new StudentDotNet(name,lastName);
    }
}

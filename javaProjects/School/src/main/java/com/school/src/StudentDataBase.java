package com.school.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentDataBase {
    private final List<Student> students;
    public StudentDataBase(ArrayList<Student> students){
        this.students = students;
    }
    public void showStudents(){
        System.out.println("-------------------------------------------------");
        if(students.isEmpty()) System.out.println("No students yet!");
        else{
            for (Student student : this.students){
                System.out.println(student);
            }
        }
        System.out.println("-------------------------------------------------");
    }
    public boolean addStudent(Student student) throws Exception {
        for (var s :this.students){
            if(s.id() == student.id()){
                throw new IllegalArgumentException("Cannot add a student with an existing ID");
            }
        }
        if(student.id()<0){
            throw new IllegalArgumentException("The ID should be a positive number");
        }
        this.students.add(student);
        return true;
    }
    public boolean deleteStudent(Student student) throws Exception {
        if(students.isEmpty()) throw new Exception("No Student yet");
        boolean check = false;
        for (var s :this.students){
            if (s.id() == student.id()) {
                check = true;
                break;
            }
        }
        if(!check)  throw new Exception("Cannot found student");
        this.students.remove(student);
        return true;
    }

    public Student searchStudent(int id) throws Exception {
        if(students.isEmpty()) throw new Exception("No Student yet");
        for (var student :this.students){
            if(student.id() == id){
                return student;
            }
        }
        throw new IllegalArgumentException("Didn't found this id");
    }
}
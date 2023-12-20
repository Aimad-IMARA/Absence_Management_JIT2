package com.school.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.school.src.School.idInput;

public class StudentDataBaseMap {

    boolean checkString(String s){
        String checker = "0123456789-*.;ñ?!¡:_{}[]`%$·/()=><|º@";
        for(int i = 0; i<s.length();i++){
            if(checker.contains(""+s.charAt(i))) return false;
        }
        return true;
    }

    static final Scanner in = new Scanner(System.in);
    private final Map<Integer,Student> studentsMap;

    public StudentDataBaseMap(){
        studentsMap = new HashMap<>();
    }

    public void addStudent() throws Exception {
        String nom="1",prenom = "1";
        double note = 101;
        System.out.println("Adding a new student :");
        System.out.println("-----------------------------------------------");

        int id = idInput();

        while (!checkString(prenom)){
            System.out.print("Name  > ");
            prenom = in.nextLine();
            if(!checkString(prenom)) System.out.println("Invalid name!");
        }
        while (!checkString(nom)){
            System.out.print("Last name > ");
            nom = in.nextLine();
            if(!checkString(nom)) System.out.println("Invalid last name!");
        }
        while (note>100 || note<0){
            System.out.print("Score (Numeric ex : 40.5 and 0 <= score <=100) > ");
            note = in.hasNextDouble()? in.nextDouble(): 101;
            in.nextLine();
            if(note>100 || note<0) System.out.println("Invalid score!");
        }
        Student student = new Student(id,nom,prenom,note);
        System.out.println("-----------------------------------------------");
        if(studentsMap.containsKey(student.id())) throw new Exception("Cannot add a new student");
        studentsMap.put(student.id(),student);
        System.out.println("Student added successfully");
        System.out.println("-----------------------------------------------");
    }

    public void deleteStudent() throws Exception{
        System.out.println("--------------------------------");

        if(studentsMap.isEmpty()) throw new Exception("No student yet!");
        int id = idInput();
        if(!studentsMap.containsKey(id)) throw new Exception("No student with this ID");
        studentsMap.remove(id);
        System.out.println("Student deleted!");
    }

    public Student searchStudent() throws Exception {
        System.out.println("--------------------------------");
        int id = idInput();
        Student student = studentsMap.get(id);
        if(studentsMap.isEmpty()) throw new Exception("No student yet!");
        if(student == null) throw new Exception("No student with this ID!");
        return student;
    }

    public void showAll(){
        System.out.println("+------+----------------+----------------+--------+");

        System.out.println("|  ID  |       Name     |    Last Name   |  Note  |");
        System.out.println("+------+----------------+----------------+--------+");
        if(!studentsMap.isEmpty()) {
            studentsMap.forEach((integer, student) -> {
                System.out.println(student);
                System.out.println("+------+----------------+----------------+--------+");
            });
            return;
        }
        System.out.println("+                NO STUDENTS YET                  +");
        System.out.println("+------+----------------+----------------+--------+");

    }
}

package com.school.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class School {
    private static final Scanner in = new Scanner(System.in);
    public static int idInput(){
        int id = -1;
        while (id < 0){
            System.out.print("ID (Numeric and > 0) > ");
            id = in.hasNextInt()?in.nextInt():-1;
            in.nextLine();
            if(id<0) System.out.println("Invalid ID");
        }
        return id;
    }
    public static void main(String[] args) throws Exception {

        int input;
        StudentDataBaseMap mapStudents = new StudentDataBaseMap();

        while (true){
            System.out.print("""
                    1. Show all students.
                    2. Add a new student.
                    3. Delete a student.
                    4. Search for a student.
                    5. Exit
                    Chose a number from 1 to 5 >\s""");
            input = in.hasNextInt()?in.nextInt():0;

            switch (input){
                case 1 -> {mapStudents.showAll();
                    System.out.println(in.next());
                    in.nextLine();
                }
                case 2 -> {
                    try {mapStudents.addStudent();}
                    catch(Exception e) {System.out.println(e.getMessage());}
                }
                case 3 -> {
                    try {
                        mapStudents.deleteStudent();
                        System.out.println("--------------------------------");
                    }
                    catch(Exception e) {System.out.println(e.getMessage());}
                }
                case 4 -> {
                    try {
                        mapStudents.searchStudent();
                        System.out.println("--------------------------------");
                    }
                    catch(Exception e) {System.out.println(e.getMessage());}
                }
                case 5 -> System.exit(1);
                default -> {
                    System.out.println("Please give a number from 1 to 5!");
                    System.out.println("--------------------------------");
                    in.nextLine();
                }
            }
            System.out.print("Press enter to continue");
            System.in.read();
            System.out.println("---------------------------------");
        }
    }
}

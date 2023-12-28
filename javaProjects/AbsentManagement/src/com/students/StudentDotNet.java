package com.students;

public class StudentNet extends Student{
    public StudentNet(String name,String lastName){
        super(name,lastName);
    }
    @Override
    String setOption() {
        return "dotnet";
    }
}

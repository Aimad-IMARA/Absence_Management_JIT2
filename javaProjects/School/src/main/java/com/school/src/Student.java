package com.school.src;

public record Student(Integer id,String nom,String prenom,double note) {

    public boolean isValidate() throws Exception{
        if((note > 100) || (note < 0)){
            throw new IllegalArgumentException("Note is not valid!");
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("| %-4d | %-14s | %-14s | %-6.2f |",id,nom,prenom,note);
    }
}

package com.absenceManagement.entities.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class SeanceDto {
    private String id;
    private LocalDate date;
    private String nomProfesseur;
    private List<EtudiantDto> etudiantsDto;
    private String address;
    private String matiere;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNomProfesseur() {
        return nomProfesseur;
    }

    public void setNomProfesseur(String nomProfesseur) {
        this.nomProfesseur = nomProfesseur;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public List<EtudiantDto> getEtudiantDtos() {
        return etudiantsDto;
    }

    public void setEtudiantsDto(List<EtudiantDto> etudiantsDto) {
        this.etudiantsDto = etudiantsDto;
    }


}

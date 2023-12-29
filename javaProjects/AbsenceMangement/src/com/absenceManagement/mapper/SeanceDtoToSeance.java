package com.absenceManagement.mapper;

import com.absenceManagement.entities.Etudiant;
import com.absenceManagement.entities.Seance;
import com.absenceManagement.entities.dto.EtudiantDto;
import com.absenceManagement.entities.dto.SeanceDto;

import java.util.ArrayList;
import java.util.List;

public class SeanceDtoToSeance {
    public static Seance seanceDtoToSeance(SeanceDto seanceDto){
        List<Etudiant> etudiants = new ArrayList<>();
        for(EtudiantDto etudiantDto: seanceDto.getEtudiantDtos()){
            etudiants.add(etudiantDtoToEtudiant(etudiantDto));
        }
        Seance seance = new Seance(seanceDto.getId(),etudiants,seanceDto.getDate());
        return seance;
    }
    private static Etudiant etudiantDtoToEtudiant(EtudiantDto etudiantDto){
        return new Etudiant(etudiantDto.getId(), etudiantDto.getName(), etudiantDto.getAge());
    }
}

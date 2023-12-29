package com.absenceManagement.web;

import com.absenceManagement.entities.dto.EtudiantDto;
import com.absenceManagement.entities.dto.SeanceDto;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Web {
    public static  SeanceDto getDatasFromApi(String urlSpec) throws IOException {

        JSONObject json = getJsonObject(urlSpec);

        String id = json.getString("id");
        JSONArray jsonArrayEtudiants = json.getJSONArray("EtudiantsPresents");
        String date = json.getString("seanceDate");
        String address = json.getString("address");

        List<EtudiantDto> etudiants = new ArrayList<>();

        for(Object objectEtudiant:jsonArrayEtudiants){
            JSONObject JSONEtudiant = (JSONObject) objectEtudiant;
            EtudiantDto etudiant = new EtudiantDto();
            etudiant.setId(JSONEtudiant.getString("id"));
            etudiant.setAge(JSONEtudiant.getInt("age"));
            etudiant.setName(JSONEtudiant.getString("name"));
            etudiant.setType(JSONEtudiant.getString("type"));
            etudiants.add(etudiant);
        }
        SeanceDto seanceDto = new SeanceDto();
        seanceDto.setId(id);
        seanceDto.setDate(null);
        seanceDto.setAddress(address);
        seanceDto.setEtudiantsDto(etudiants);
        return seanceDto;
    }

    private static JSONObject getJsonObject(String urlSpec) throws IOException {
        URL url = new URL(urlSpec);
        HttpURLConnection connection =  (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line = reader.readLine();
        do{
            response.append(line);
        }while ((line = reader.readLine()) != null);
        reader.close();

        JSONObject json =  new JSONObject(response.toString());
        return json;
    }
}

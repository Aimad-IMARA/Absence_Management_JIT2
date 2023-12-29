package com.absenceManagement.dao.impl;

import com.absenceManagement.dao.Database;
import com.absenceManagement.dao.EtudiantDao;
import com.absenceManagement.entities.Etudiant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EtudiantDaoImp implements EtudiantDao {

    @Override
    public Etudiant get(String id) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            con = Database.getConnection();
            String query = "SELECT * FROM etudiants WHERE ID=?";
            ps = con.prepareStatement(query);
            ps.setString(1, id);
            result = ps.executeQuery();

            if (result.next()) {
                String etuId = result.getString(1);
                String etuName = result.getString(2);
                int etuAge = result.getInt(3);
                return new Etudiant(etuId, etuName, etuAge);
            }
        } finally {
            if (result != null) {
                result.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }

    @Override
    public List<Etudiant> getAll() throws SQLException {
        Connection con = Database.getConnection();
        String query = "SELECT * FROM etudiants";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet result = ps.executeQuery();

        List<Etudiant> etudiants = new ArrayList<>();

        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            int age = result.getInt(3);

            Etudiant etudiant = new Etudiant(id, name, age);
            etudiants.add(etudiant);
        }

        // Close resources
        result.close();
        ps.close();
        con.close();

        return etudiants;
    }

    @Override
    public int insert(Etudiant etudiant) throws SQLException {
        Connection con = Database.getConnection();
        String query = "INSERT INTO ETUDIANTS VALUES(?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,etudiant.getId());
        ps.setString(2,etudiant.getName());
        ps.setInt(3,etudiant.getAge());

        int result = ps.executeUpdate();
        ps.close();
        con.close();
        return result;
    }

    @Override
    public int update(Etudiant etudiant) throws SQLException {
        Connection con = Database.getConnection();
        String query = "UPDATE ETUDIANT SET name=?,age=? Where id=?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, etudiant.getName());
        ps.setInt(2,etudiant.getAge());
        ps.setString(3, etudiant.getId());

        int result = ps.executeUpdate();

        ps.close();
        con.close();

        return result;
    }

    @Override
    public int delete(Etudiant etudiant) throws SQLException  {
        Connection con = Database.getConnection();
        String query = "DELETE FROM ETUDIANTS WHERE ID=?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1,etudiant.getId());
        int result = ps.executeUpdate();

        ps.close();
        con.close();
        return result;
    }
}

package com.absenceManagement.dao;

import com.absenceManagement.modules.Etudiant;

import javax.swing.text.html.Option;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EtudiantDAOImp implements EtudiantDAO{

    @Override
    public Etudiant get(String id) throws SQLException {
        Connection con = Database.getConnection();
        String query = "SELECT * FROM etudiants WHERE ID=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,id);
        ResultSet result = ps.executeQuery();
        if(result.next()){
            String oid = result.getString(1);
            String oname = result.getString(2);
            String otype = result.getString(3);
            int oAge = result.getInt(4);
            return new Etudiant(oid,oname,oAge,otype);
        }
        return null;
    }

    @Override
    public List<Etudiant> getAll() throws SQLException {
        return null;
    }

    @Override
    public int insert(Etudiant etudiant) {
        return 0;
    }

    @Override
    public int save(Etudiant etudiant) {
        return 0;
    }

    @Override
    public int update(Etudiant etudiant) {
        return 0;
    }

    @Override
    public int delete(Etudiant etudiant) {
        return 0;
    }
}

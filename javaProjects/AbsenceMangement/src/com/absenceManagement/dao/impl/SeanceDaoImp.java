package com.absenceManagement.dao.impl;

import com.absenceManagement.dao.SeanceDao;
import com.absenceManagement.entities.Seance;

import java.sql.SQLException;
import java.util.List;

public class SeanceDaoImp implements SeanceDao {
    @Override
    public Seance get(String id) throws SQLException {
        return null;
    }

    @Override
    public List<Seance> getAll() throws SQLException {
        return null;
    }

    @Override
    public int insert(Seance seance) throws SQLException {
        return 0;
    }

    @Override
    public int update(Seance seance) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Seance seance) throws SQLException {
        return 0;
    }
}

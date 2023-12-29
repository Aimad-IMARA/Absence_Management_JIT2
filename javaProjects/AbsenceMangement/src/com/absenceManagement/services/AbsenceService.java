package com.absenceManagement.services;

import com.absenceManagement.entities.Etudiant;
import com.absenceManagement.entities.Seance;

public interface AbsenceService {
    void marquerPresence(Seance seance);
}

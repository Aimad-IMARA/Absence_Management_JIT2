package com.absenceManagement.service;

import com.absenceManagement.modules.Etudiant;
import com.absenceManagement.modules.Seance;

public interface AbsenceService {
    void marquerPresence(Seance seance, Etudiant etudiant);
}

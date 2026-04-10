package tn.esprit.arctic.projspring1.service;

import tn.esprit.arctic.projspring1.entity.Pilote;

public interface IPiloteService {
    String addPilote(Pilote p);
    Pilote affecterPiloteAEquipe(String libelleP, String libelleEq);
}

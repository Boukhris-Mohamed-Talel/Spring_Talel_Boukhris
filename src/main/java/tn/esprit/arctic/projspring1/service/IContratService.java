package tn.esprit.arctic.projspring1.service;

import tn.esprit.arctic.projspring1.entity.Contrat;

public interface IContratService {
    Contrat ajoutContratEtAffecterASponsorEtEquipe(Contrat contrat, String libelleEquipe, String nomSponsor, String pays);
}

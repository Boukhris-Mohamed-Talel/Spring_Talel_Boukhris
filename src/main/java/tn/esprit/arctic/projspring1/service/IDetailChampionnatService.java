package tn.esprit.arctic.projspring1.service;

import tn.esprit.arctic.projspring1.entity.DetailChampionnat;

public interface IDetailChampionnatService {
    DetailChampionnat ajouterEtaffecterDetailChampionnatAChampionnat(DetailChampionnat dc, Long idChampionnat);
}

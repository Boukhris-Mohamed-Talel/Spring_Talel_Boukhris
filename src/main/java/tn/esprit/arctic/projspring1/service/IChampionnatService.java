package tn.esprit.arctic.projspring1.service;

import tn.esprit.arctic.projspring1.entity.Championnat;

public interface IChampionnatService {
    Championnat addChampionnatAndAssociatedCourses(Championnat championnat);
}

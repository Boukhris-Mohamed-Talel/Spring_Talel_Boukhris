package tn.esprit.arctic.projspring1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projspring1.entity.Championnat;
import tn.esprit.arctic.projspring1.service.IChampionnatService;

@RestController
@AllArgsConstructor
public class ChampionnatController {

    private IChampionnatService championnatService;

    @PostMapping("/add-championnat-with-courses")
    public Championnat addChampionnatAndAssociatedCourses(@RequestBody Championnat championnat) {
        return championnatService.addChampionnatAndAssociatedCourses(championnat);
    }
}

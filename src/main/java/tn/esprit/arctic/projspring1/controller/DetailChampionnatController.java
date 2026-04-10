package tn.esprit.arctic.projspring1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projspring1.entity.DetailChampionnat;
import tn.esprit.arctic.projspring1.service.IDetailChampionnatService;

@RestController
@AllArgsConstructor
public class DetailChampionnatController {

    private IDetailChampionnatService detailChampionnatService;

    @PostMapping("/add-detail-championnat/{idChampionnat}")
    public DetailChampionnat ajouterEtaffecterDetailChampionnatAChampionnat(
            @RequestBody DetailChampionnat dc,
            @PathVariable Long idChampionnat) {
        return detailChampionnatService.ajouterEtaffecterDetailChampionnatAChampionnat(dc, idChampionnat);
    }
}

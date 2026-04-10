package tn.esprit.arctic.projspring1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projspring1.entity.Pilote;
import tn.esprit.arctic.projspring1.service.IPiloteService;

@RestController
@AllArgsConstructor
public class PiloteController {

    private IPiloteService piloteService;

    @PostMapping("/add-pilote")
    public String addPilote(@RequestBody Pilote pilote) {
        return piloteService.addPilote(pilote);
    }

    @PutMapping("/affecter-pilote-equipe/{libelleP}/{libelleEq}")
    public Pilote affecterPiloteAEquipe(@PathVariable String libelleP, @PathVariable String libelleEq) {
        return piloteService.affecterPiloteAEquipe(libelleP, libelleEq);
    }
}

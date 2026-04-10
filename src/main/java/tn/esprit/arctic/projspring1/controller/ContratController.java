package tn.esprit.arctic.projspring1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projspring1.entity.Contrat;
import tn.esprit.arctic.projspring1.service.IContratService;

@RestController
@AllArgsConstructor
public class ContratController {

    private IContratService contratService;

    @PostMapping("/add-contrat/{libelleEquipe}/{nomSponsor}/{pays}")
    public Contrat ajoutContratEtAffecterASponsorEtEquipe(
            @RequestBody Contrat contrat,
            @PathVariable String libelleEquipe,
            @PathVariable String nomSponsor,
            @PathVariable String pays) {
        return contratService.ajoutContratEtAffecterASponsorEtEquipe(contrat, libelleEquipe, nomSponsor, pays);
    }
}

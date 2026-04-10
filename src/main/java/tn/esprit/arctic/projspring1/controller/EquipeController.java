package tn.esprit.arctic.projspring1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projspring1.entity.Equipe;
import tn.esprit.arctic.projspring1.service.IEquipeService;

@RestController
@AllArgsConstructor
public class EquipeController {

    private IEquipeService equipeService;

    @PostMapping("/add-equipe")
    public Equipe ajouterEquipe(@RequestBody Equipe equipe) {
        return equipeService.ajouterEquipe(equipe);
    }
}

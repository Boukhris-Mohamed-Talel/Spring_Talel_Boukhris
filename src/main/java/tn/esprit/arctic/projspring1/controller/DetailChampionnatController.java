package tn.esprit.arctic.projspring1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.projspring1.service.IDetailChampionnatService;

@RestController
@AllArgsConstructor
public class DetailChampionnatController {

    private IDetailChampionnatService detailChampionnatService;
}

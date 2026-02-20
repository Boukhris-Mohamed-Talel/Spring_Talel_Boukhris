package tn.esprit.arctic.projspring1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.projspring1.service.IContratService;

@RestController
@AllArgsConstructor
public class ContratController {

    private IContratService contratService;
}

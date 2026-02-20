package tn.esprit.arctic.projspring1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.projspring1.service.ISponsorService;

@RestController
@AllArgsConstructor
public class SponsorController {

    private ISponsorService sponsorService;
}

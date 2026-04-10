package tn.esprit.arctic.projspring1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projspring1.entity.Sponsor;
import tn.esprit.arctic.projspring1.service.ISponsorService;

import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {

    private ISponsorService sponsorService;

    @PostMapping("/add-sponsor")
    public Sponsor ajouterSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.ajouterSponsor(sponsor);
    }

    @PostMapping("/add-sponsors")
    public List<Sponsor> ajouterSponsors(@RequestBody List<Sponsor> sponsors) {
        return sponsorService.ajouterSponsors(sponsors);
    }

    @PutMapping("/update-sponsor")
    public Sponsor modifierSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.modifierSponsor(sponsor);
    }

    @DeleteMapping("/delete-sponsor/{id}")
    public void supprimerSponsor(@PathVariable Long id) {
        sponsorService.supprimerSponsor(id);
    }

    @GetMapping("/retrieve-all-sponsors")
    public List<Sponsor> listSponsors() {
        return sponsorService.listSponsors();
    }

    @GetMapping("/retrieve-sponsor/{id}")
    public Sponsor recupererSponsor(@PathVariable Long id) {
        return sponsorService.recupererSponsor(id);
    }

    @PutMapping("/archive-sponsor/{id}")
    public Boolean archiverSponsor(@PathVariable Long id) {
        return sponsorService.archiverSponsor(id);
    }
}

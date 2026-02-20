package tn.esprit.arctic.projspring1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projspring1.entity.Sponsor;
import tn.esprit.arctic.projspring1.repository.SponsorRepository;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class SponsorServiceImpl implements ISponsorService {

    private final SponsorRepository sponsorRepository;

    @Override
    public Sponsor ajouterSponsor(Sponsor sponsor) {
        Date now = new Date();
        sponsor.setDateCreation(now);
        sponsor.setArchived(false);
        sponsor.setBooleanBloquerContrat(false);
        return sponsorRepository.save(sponsor);
    }

    @Override
    public List<Sponsor> ajouterSponsors(List<Sponsor> sponsors) {
        Date now = new Date();
        for (Sponsor sponsor : sponsors) {
            sponsor.setDateCreation(now);
            sponsor.setArchived(false);
            sponsor.setBooleanBloquerContrat(false);
        }
        return sponsorRepository.saveAll(sponsors);
    }

    @Override
    public Sponsor modifierSponsor(Sponsor sponsor) {
        Date now = new Date();
        sponsor.setDateDerniereModification(now);
        return sponsorRepository.save(sponsor);
    }

    @Override
    public void supprimerSponsor(Long idSponsor) {
        sponsorRepository.deleteById(idSponsor);
    }

    @Override
    public List<Sponsor> listSponsors() {
        return sponsorRepository.findAll();
    }

    @Override
    public Sponsor recupererSponsor(Long idSponsor) {
        return sponsorRepository.findById(idSponsor).orElse(null);
    }

    @Override
    public Boolean archiverSponsor(Long idSponsor) {
        Sponsor sponsor = sponsorRepository.findById(idSponsor).orElse(null);
        if (sponsor == null) {
            return false;
        }
        sponsor.setArchived(true);
        sponsorRepository.save(sponsor);
        return true;
    }
}

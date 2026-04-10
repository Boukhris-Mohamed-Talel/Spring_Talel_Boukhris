package tn.esprit.arctic.projspring1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projspring1.entity.Contrat;
import tn.esprit.arctic.projspring1.entity.Equipe;
import tn.esprit.arctic.projspring1.entity.Sponsor;
import tn.esprit.arctic.projspring1.repository.ContratRepository;
import tn.esprit.arctic.projspring1.repository.EquipeRepository;
import tn.esprit.arctic.projspring1.repository.SponsorRepository;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService {

    private ContratRepository contratRepository;
    private EquipeRepository equipeRepository;
    private SponsorRepository sponsorRepository;

    @Override
    public Contrat ajoutContratEtAffecterASponsorEtEquipe(Contrat contrat, String libelleEquipe, String nomSponsor, String pays) {
        Equipe equipe = equipeRepository.findByStringLibelle(libelleEquipe);
        Sponsor sponsor = sponsorRepository.findByStringNomAndStringPays(nomSponsor, pays);
        if (equipe != null && sponsor != null) {
            contrat.setEquipe(equipe);
            contrat.setSponsor(sponsor);
            return contratRepository.save(contrat);
        }
        return null;
    }
}

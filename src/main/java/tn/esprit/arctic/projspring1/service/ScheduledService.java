package tn.esprit.arctic.projspring1.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projspring1.entity.Contrat;
import tn.esprit.arctic.projspring1.entity.Equipe;
import tn.esprit.arctic.projspring1.entity.Pilote;
import tn.esprit.arctic.projspring1.entity.Sponsor;
import tn.esprit.arctic.projspring1.repository.*;

import java.time.Year;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ScheduledService {

    private ContratRepository contratRepository;
    private EquipeRepository equipeRepository;
    private SponsorRepository sponsorRepository;
    private PiloteRepository piloteRepository;
    private PositionRepository positionRepository;
    private ISponsorService sponsorService;

    @Scheduled(fixedRate = 30000)
    public void archiverContratsExpireesEtAffichageContratsActifsParEquipe() {
        String currentYear = String.valueOf(Year.now().getValue());

        List<Contrat> expiredContrats = contratRepository.findExpiredContrats(currentYear);
        for (Contrat contrat : expiredContrats) {
            contrat.setBooleanArchived(true);
            contratRepository.save(contrat);
        }
        log.info("Contrats expirés archivés : " + expiredContrats.size());

        List<Equipe> equipes = equipeRepository.findAll();
        for (Equipe equipe : equipes) {
            List<Contrat> contratsActifs = contratRepository.findByEquipeAndBooleanArchivedFalse(equipe);
            if (!contratsActifs.isEmpty()) {
                log.info("Equipe : " + equipe.getStringLibelle());
                for (Contrat c : contratsActifs) {
                    log.info("\tContrat n°" + c.getLongIdContrat()
                            + " | Montant : " + c.getFloatMontant()
                           + " | Annee : " + c.getStringAnnee()
                           + " | Sponsor : " + (c.getSponsor() != null ? c.getSponsor().getStringNom() : "N/A"));
                }
            }
        }
    }

    @Scheduled(fixedRate = 30000)//(cron = "0 0 9 * * MON")
    public void afficherPourcentageBudgetParSponsor() {
        List<Sponsor> sponsors = sponsorRepository.findAll();
        for (Sponsor sponsor : sponsors) {
            Float pourcentage = sponsorService.pourcentageBudgetAnnuelConsomme(sponsor.getLongIdSponsor());
            if (pourcentage > 100) {
                log.info("Sponsor " + sponsor.getStringNom()
                        + " : budget dépassé!! vous ne pouvez plus faire de contrats");
                sponsor.setBooleanBloquerContrat(true);
                sponsorRepository.save(sponsor);
            } else if (pourcentage > 70) {
                log.info("Sponsor " + sponsor.getStringNom()
                        + " : attention budget presque consommé : " + pourcentage.intValue() + " % !");
            } else {
                log.info("Sponsor " + sponsor.getStringNom()
                        + " : budget consommé à " + pourcentage.intValue() + " %");
            }
        }
        //log.info("hello");
    }

    @Scheduled(cron = "0 15 11 31 12 *")//(fixedRate = 30000)
    public void mettreAJourPointsEtClassement() {
        int currentYear = Year.now().getValue();
        List<Pilote> pilotes = piloteRepository.findAll();

        for (Pilote pilote : pilotes) {
            Integer totalPoints = positionRepository.sumPointsByPiloteAndYear(
                    pilote.getLongIdPilote(), currentYear);
            pilote.setIntegerNbPointsTotal(totalPoints != null ? totalPoints : 0);
            piloteRepository.save(pilote);
        }

        List<Pilote> pilotesTries = piloteRepository.findAllByOrderByIntegerNbPointsTotalDesc();
        int classement = 1;
        for (Pilote pilote : pilotesTries) {
            pilote.setIntegerClassementGeneral(classement++);
            piloteRepository.save(pilote);
        }

        log.info("Mise à jour des points et classement terminée pour l'année " + currentYear);
        //log.info("hello");
    }
}


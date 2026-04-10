package tn.esprit.arctic.projspring1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projspring1.entity.Equipe;
import tn.esprit.arctic.projspring1.entity.Pilote;
import tn.esprit.arctic.projspring1.repository.EquipeRepository;
import tn.esprit.arctic.projspring1.repository.PiloteRepository;

@Service
@AllArgsConstructor
public class PiloteServiceImpl implements IPiloteService {

    private PiloteRepository piloteRepository;
    private EquipeRepository equipeRepository;

    @Override
    public String addPilote(Pilote p) {
        piloteRepository.save(p);
        return "Pilote ajoute avec succes";
    }

    @Override
    public Pilote affecterPiloteAEquipe(String libelleP, String libelleEq) {
        Pilote pilote = piloteRepository.findByStringLibelleP(libelleP);
        Equipe equipe = equipeRepository.findByStringLibelle(libelleEq);
        if (pilote != null && equipe != null) {
            pilote.setEquipe(equipe);
            return piloteRepository.save(pilote);
        }
        return null;
    }
}

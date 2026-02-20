package tn.esprit.arctic.projspring1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projspring1.entity.Pilote;
import tn.esprit.arctic.projspring1.repository.PiloteRepository;

@Service
@AllArgsConstructor
public class PiloteServiceImpl implements IPiloteService {

    private PiloteRepository piloteRepository;

    @Override
    public String addPilote(Pilote p) {
        piloteRepository.save(p);
        return "Pilote ajoute avec succes";
    }
}

package tn.esprit.arctic.projspring1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projspring1.entity.Equipe;
import tn.esprit.arctic.projspring1.repository.EquipeRepository;

@Service
@AllArgsConstructor
public class EquipeServiceImpl implements IEquipeService {

    private EquipeRepository equipeRepository;

    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }
}

package tn.esprit.arctic.projspring1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projspring1.repository.ChampionnatRepository;

@Service
@AllArgsConstructor
public class ChampionnatServiceImpl implements IChampionnatService {

    private ChampionnatRepository championnatRepository;
}

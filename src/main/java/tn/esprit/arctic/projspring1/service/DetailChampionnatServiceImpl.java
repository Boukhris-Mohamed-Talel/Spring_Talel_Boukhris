package tn.esprit.arctic.projspring1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projspring1.entity.Championnat;
import tn.esprit.arctic.projspring1.entity.DetailChampionnat;
import tn.esprit.arctic.projspring1.repository.ChampionnatRepository;
import tn.esprit.arctic.projspring1.repository.DetailChampionnatRepository;

@Service
@AllArgsConstructor
public class DetailChampionnatServiceImpl implements IDetailChampionnatService {

    private DetailChampionnatRepository detailChampionnatRepository;
    private ChampionnatRepository championnatRepository;

    @Override
    public DetailChampionnat ajouterEtaffecterDetailChampionnatAChampionnat(DetailChampionnat dc, Long idChampionnat) {
        Championnat championnat = championnatRepository.findById(idChampionnat).orElse(null);
        if (championnat != null) {
            DetailChampionnat savedDc = detailChampionnatRepository.save(dc);
            championnat.setDetailChampionnat(savedDc);
            championnatRepository.save(championnat);
            return savedDc;
        }
        return null;
    }
}

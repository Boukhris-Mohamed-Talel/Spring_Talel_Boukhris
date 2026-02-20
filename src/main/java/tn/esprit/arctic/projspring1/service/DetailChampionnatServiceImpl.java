package tn.esprit.arctic.projspring1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projspring1.repository.DetailChampionnatRepository;

@Service
@AllArgsConstructor
public class DetailChampionnatServiceImpl implements IDetailChampionnatService {

    private DetailChampionnatRepository detailChampionnatRepository;
}

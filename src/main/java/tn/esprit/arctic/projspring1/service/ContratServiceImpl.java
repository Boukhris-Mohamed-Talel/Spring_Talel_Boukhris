package tn.esprit.arctic.projspring1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projspring1.repository.ContratRepository;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService {

    private ContratRepository contratRepository;
}

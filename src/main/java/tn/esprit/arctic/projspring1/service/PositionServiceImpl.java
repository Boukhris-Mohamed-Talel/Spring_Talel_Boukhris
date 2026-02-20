package tn.esprit.arctic.projspring1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projspring1.repository.PositionRepository;

@Service
@AllArgsConstructor
public class PositionServiceImpl implements IPositionService {

    private PositionRepository positionRepository;
}

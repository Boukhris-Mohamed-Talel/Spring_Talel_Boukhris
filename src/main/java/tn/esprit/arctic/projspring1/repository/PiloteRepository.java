package tn.esprit.arctic.projspring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.projspring1.entity.Pilote;

import java.util.List;

@Repository
public interface PiloteRepository extends JpaRepository<Pilote, Long> {
    Pilote findByStringLibelleP(String stringLibelleP);
    List<Pilote> findAllByOrderByIntegerNbPointsTotalDesc();
}

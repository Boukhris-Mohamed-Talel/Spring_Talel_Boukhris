package tn.esprit.arctic.projspring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.projspring1.entity.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
    Equipe findByStringLibelle(String stringLibelle);
}

package tn.esprit.arctic.projspring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.projspring1.entity.Pilote;

@Repository
public interface PiloteRepository extends JpaRepository<Pilote, Long> {
}

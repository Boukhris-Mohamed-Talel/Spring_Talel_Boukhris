package tn.esprit.arctic.projspring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.projspring1.entity.DetailChampionnat;

@Repository
public interface DetailChampionnatRepository extends JpaRepository<DetailChampionnat, Long> {
}

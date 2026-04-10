package tn.esprit.arctic.projspring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.projspring1.entity.Sponsor;

@Repository
public interface SponsorRepository extends JpaRepository<Sponsor, Long> {
    Sponsor findByStringNomAndStringPays(String stringNom, String stringPays);
}

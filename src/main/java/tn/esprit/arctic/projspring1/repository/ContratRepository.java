package tn.esprit.arctic.projspring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.projspring1.entity.Contrat;
import tn.esprit.arctic.projspring1.entity.Equipe;

import java.util.List;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {

    @Query("SELECT c FROM Contrat c WHERE c.stringAnnee < :currentYear AND c.booleanArchived = false")
    List<Contrat> findExpiredContrats(@Param("currentYear") String currentYear);

    List<Contrat> findByEquipeAndBooleanArchivedFalse(Equipe equipe);

    @Query("SELECT SUM(c.floatMontant) FROM Contrat c WHERE c.sponsor.longIdSponsor = :idSponsor AND c.stringAnnee = :year")
    Float sumMontantBySponsorAndYear(@Param("idSponsor") Long idSponsor, @Param("year") String year);
}

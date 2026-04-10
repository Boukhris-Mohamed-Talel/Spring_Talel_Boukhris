package tn.esprit.arctic.projspring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.projspring1.entity.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {

    @Query("SELECT SUM(p.integerNbPoints) FROM Position p WHERE p.pilote.longIdPilote = :idPilote AND YEAR(p.course.localDateDateCourse) = :year")
    Integer sumPointsByPiloteAndYear(@Param("idPilote") Long idPilote, @Param("year") int year);
}

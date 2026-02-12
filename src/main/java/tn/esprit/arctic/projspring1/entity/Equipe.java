package tn.esprit.arctic.projspring1.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Equipe")
public class Equipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "longIdEquipe")
    private Long longIdEquipe;

    private String stringLibelle;

    private Integer integerNbPointsTotal;

    private Integer integerClassementGeneral;

    @OneToMany(mappedBy = "equipe")
    private List<Pilote> piloteList;

    @OneToMany(mappedBy = "equipe")
    private List<Contrat> contratList;
}
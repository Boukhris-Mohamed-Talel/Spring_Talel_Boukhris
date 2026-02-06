package tn.esprit.arctic.projspring1.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Championnat")
public class Championnat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "longIdChampionnat")
    private Long longIdChampionnat;

    @Enumerated(EnumType.STRING)
    private Categorie categorieCategorie;

    private String stringLibelleC;

    private Integer integerAnnee;
}
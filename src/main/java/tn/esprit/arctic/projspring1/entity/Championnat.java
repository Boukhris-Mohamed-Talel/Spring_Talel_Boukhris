package tn.esprit.arctic.projspring1.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "championnat_id", referencedColumnName = "id")
    private DetailChampionnat detailChampionnat;

    @OneToMany(mappedBy = "championnat")
    private List<Course> courseList;
}
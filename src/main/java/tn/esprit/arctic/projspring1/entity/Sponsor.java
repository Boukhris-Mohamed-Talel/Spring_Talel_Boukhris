package tn.esprit.arctic.projspring1.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Sponsor")
public class Sponsor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "longIdSponsor")
    private Long longIdSponsor;

    private String stringNom;

    private String stringPays;

    private Float floatBudgetAnnuel;

    private Boolean booleanBloquerContrat;
}
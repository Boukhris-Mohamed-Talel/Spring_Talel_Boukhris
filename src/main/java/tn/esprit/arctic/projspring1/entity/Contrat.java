package tn.esprit.arctic.projspring1.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Contrat")
public class Contrat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "longIdContrat")
    private Long longIdContrat;

    private Float floatMontant;

    private String stringAnnee;

    private Boolean booleanArchived;
}
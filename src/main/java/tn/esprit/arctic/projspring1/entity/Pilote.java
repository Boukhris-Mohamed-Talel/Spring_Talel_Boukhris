package tn.esprit.arctic.projspring1.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Pilote")
public class Pilote implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "longIdPilote")
    private Long longIdPilote;

    private String stringLibelleP;

    private Integer integerNbPointsTotal;

    private Integer integerClassementGeneral;
}
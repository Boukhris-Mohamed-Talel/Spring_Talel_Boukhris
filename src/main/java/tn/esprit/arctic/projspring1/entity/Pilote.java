package tn.esprit.arctic.projspring1.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Pilote")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pilote implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "longIdPilote")
    private Long longIdPilote;

    private String stringLibelleP;

    private Integer integerNbPointsTotal;

    private Integer integerClassementGeneral;

    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

    @OneToMany(mappedBy = "pilote")
    private List<Position> positionList;
}
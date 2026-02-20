package tn.esprit.arctic.projspring1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Sponsor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sponsor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "longIdSponsor")
    private Long longIdSponsor;

    private String stringNom;

    private String stringPays;

    private Float floatBudgetAnnuel;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDerniereModification;

    private Boolean archived;

    private Boolean booleanBloquerContrat;

    @OneToMany(mappedBy = "sponsor")
    private List<Contrat> contratList;
}
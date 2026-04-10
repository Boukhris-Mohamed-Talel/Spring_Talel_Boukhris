package tn.esprit.arctic.projspring1.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "DetailChampionnat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailChampionnat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String stringCode;

    private String stringDescription;

    @OneToOne(mappedBy = "detailChampionnat")
    private Championnat championnat;
}
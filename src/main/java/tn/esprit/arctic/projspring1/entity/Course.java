package tn.esprit.arctic.projspring1.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Course")
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "longIdCourse")
    private Long longIdCourse;

    private String stringEmplacement;

    @Temporal(TemporalType.DATE)
    private Date localDateDateCourse;

    @ManyToOne
    @JoinColumn(name = "championnat_id")
    private Championnat championnat;

    @OneToMany(mappedBy = "course")
    private List<Position> positionList;
}
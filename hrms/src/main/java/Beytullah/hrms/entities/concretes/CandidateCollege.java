package Beytullah.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="schools")
public class CandidateCollege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private  String name;

    @Column(name = "episode")
    private String episode;

    @Column(name = "year_of_graduation")
    private String yearOfGraduation;

    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;



}

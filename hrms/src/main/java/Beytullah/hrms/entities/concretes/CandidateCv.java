package Beytullah.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "candidate_cvs")
public class CandidateCv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_cv_id")
    private int candidateCvId;


    @OneToMany(mappedBy = "candidateCv")
    List<CandidateForeignLanguage> candidateForeignLanguages;

    @Column(name = "cover_letter")
    private String coverLetter;
}

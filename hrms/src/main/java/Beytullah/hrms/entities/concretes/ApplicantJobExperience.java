package Beytullah.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="applicant_job_experience")
public class ApplicantJobExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_experience_id")
    private int jobExperienceId;

    @Column(name = "company")
    private String company;

    @Column(name="position")
    private String position;

    @Column(name = "starting_year")
    private int startingYear;

    @Column(name = "ending_year")
    private int endingYear;

    @ManyToOne
    @JoinColumn(referencedColumnName = "cv_id")
    private ApplicantCv applicantCv;
}

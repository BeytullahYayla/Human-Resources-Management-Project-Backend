package Beytullah.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job_experience")
public class JobExperience {
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
}

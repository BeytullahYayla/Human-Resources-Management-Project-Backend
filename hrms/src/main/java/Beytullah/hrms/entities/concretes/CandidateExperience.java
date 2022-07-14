package Beytullah.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate_experiences")
public class CandidateExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_experience_id")
    private int candidateExpId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "starting_year")
    private int startingYear;

    @Column(name = "ending_year")
    private int endingYear;





}

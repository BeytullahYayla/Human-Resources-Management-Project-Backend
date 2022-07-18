package Beytullah.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "candidate_cv_experiences")
@AllArgsConstructor
@NoArgsConstructor
public class CandidateExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @NotBlank
    @Size(max = 100)
    @Column(name = "company_name")
    private String companyName;

    @NotNull
    @Past
    @Column(name = "starting_date")
    private LocalDate startingDate;

    @Past
    @Column(name = "quit_date")
    private LocalDate quitDate;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "candidate_cv_id")
    private CandidateCv candidateCv;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "job_id")
    private Job job;
}

package Beytullah.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "candidate_cv_languages")
@AllArgsConstructor
@NoArgsConstructor
public class CandidateForeignLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @Min(1)
    @Max(5)
    @Column(name = "level")
    private int level;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "candidate_cv_id")
    private CandidateCv candidateCv;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "language_id")
    private Language language;

}

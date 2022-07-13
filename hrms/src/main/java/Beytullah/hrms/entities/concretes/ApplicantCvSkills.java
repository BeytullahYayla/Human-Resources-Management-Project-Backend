package Beytullah.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "applicant_cv_skills")
public class ApplicantCvSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="skill_id")
    private int skillId;

    @Column(name="level")
    private int level;

    @Column(name = "name")
    private String name;

    @ManyToOne()
    @JoinColumn(referencedColumnName = "cv_id")
    private ApplicantCv applicantCv;


}

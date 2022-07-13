package Beytullah.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "applicant_foreign_language")
public class ApplicantForeignLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foreign_lang_name")
    private String foreignLanguageName;

    @Column(name="level")
    private int level;

    @ManyToOne()
    @JoinColumn(referencedColumnName = "cv_id")
    private ApplicantCv applicantCv;
}

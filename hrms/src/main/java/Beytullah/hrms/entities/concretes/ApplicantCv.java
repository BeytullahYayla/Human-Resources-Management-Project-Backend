package Beytullah.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="applicant_cvs")
public class ApplicantCv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cv_id")
    private int applicantCvId;

    @Column(name="cover_letter")
    private String coverLetter;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id",referencedColumnName = "Id")
    private Applicant applicant;

    @OneToMany(mappedBy ="applicantCv")
    private List<ApplicantCollege> applicantColleges;

    @OneToMany(mappedBy = "applicantCv")
    private List<ApplicantForeignLanguage> foreignLanguages;

    @OneToMany(mappedBy = "applicantCv")
    private List<ApplicantJobExperience> applicantJobExperiences;

    @OneToMany(mappedBy = "applicantCv")
    private List<ApplicantImage> applicantImages;

    @OneToMany(mappedBy = "applicantCv")
    private List<ApplicantCvSkills> applicantCvSkills;

    @OneToMany(mappedBy = "applicantCv")
    private List<ApplicantCvWebsite> applicantCvWebsites;





}

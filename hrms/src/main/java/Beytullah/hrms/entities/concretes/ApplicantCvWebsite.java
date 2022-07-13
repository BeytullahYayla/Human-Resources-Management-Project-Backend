package Beytullah.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "applicant_cv_website")
public class ApplicantCvWebsite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cv_website_id")
    private int websiteId;

    @Column(name = "github")
    private String githubUrl;

    @Column(name ="linkedin")
    private String linkedinUrl;

    @ManyToOne()
    @JoinColumn(referencedColumnName = "cv_id")
    private ApplicantCv applicantCv;
}

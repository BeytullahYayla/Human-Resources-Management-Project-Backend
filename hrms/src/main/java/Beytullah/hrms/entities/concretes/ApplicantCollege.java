package Beytullah.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "applicant_colleges")
public class ApplicantCollege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "college_id")
    private int collegeId;

    @Column(name="college_name")
    private String collegeName;

    @Column(name = "college_department")
    private String collegeDepartment;

    @Column(name="starting_year")
    private int startingYear;

    @Column(name = "ending_year")
    private int endingYear;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "cv_id")
    private ApplicantCv applicantCv;



}

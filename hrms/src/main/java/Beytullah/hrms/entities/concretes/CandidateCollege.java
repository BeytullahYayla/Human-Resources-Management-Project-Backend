package Beytullah.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate_colleges")
public class CandidateCollege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_college_id")
    private int candidateCollegeId;

    @Column(name = "college_name")
    private String collegeName;

    @Column(name = "college_department")
    private String collegeDepartment;

    @Column(name = "starting_year")
    private int startingYear;

    @Column(name = "ending_year")
    private int endingYear;

    @Column(name = "graduation_year")
    private int graduationYear;

}

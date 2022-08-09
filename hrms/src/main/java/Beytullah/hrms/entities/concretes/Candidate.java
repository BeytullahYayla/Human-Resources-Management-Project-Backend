package Beytullah.hrms.entities.concretes;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidates")
public class Candidate {


    @Id
    @Column(name = "user_id")
    private int id;


    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;


    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="nationality_number")
    private String nationalityNumber;

    @Column(name="year_of_birth")
    private int yearOfBirth;

    @Column(name="cover_letter")
    private String	coverLetter;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name="github")
    private String github;

    @Column(name="linkedin")
    private String linkedin;


    @OneToMany(mappedBy = "candidate")

    private List<CandidateCollege> schools;

    @OneToMany(mappedBy = "candidate")

    private List<CandidateExperience> experiences;

    @OneToMany(mappedBy = "candidate")

    private List<CandidateForeignLanguage> languages;

    @OneToMany(mappedBy = "candidate")

    private List<Talent> talents;
}
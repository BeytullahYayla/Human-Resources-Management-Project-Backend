package Beytullah.hrms.entities.concretes;

import Beytullah.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "applicant")
public class Applicant extends User {

    /*
    @Notn
    @NotBlank
    @Pattern(regexp = "^\\d{11}$", message = "National identity must be 11 digits")

     */
    @Column(name = "national_identity")
    private String nationalIdentity;

    //@NotNull
    //@NotBlank
    //@Size(max = 50)
    @Column(name = "first_name")
    private String firstName;

    //@NotNull
    //@NotBlank
    //@Size(max = 50)
    @Column(name = "last_name")
    private String lastName;

    //@NotNull
    //@Past
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @OneToOne(mappedBy = "applicant")
    private ApplicantCv applicantCv;












}

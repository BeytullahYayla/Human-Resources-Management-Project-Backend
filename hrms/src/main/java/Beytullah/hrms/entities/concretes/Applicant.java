package Beytullah.hrms.entities.concretes;

import Beytullah.hrms.core.entities.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "applicants")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="user_id", referencedColumnName = "Id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","applicantCv"})
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


    @OneToOne(mappedBy = "applicant")
    private ApplicantCv applicantCv;












}

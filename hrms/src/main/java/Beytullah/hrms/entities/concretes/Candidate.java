package Beytullah.hrms.entities.concretes;
import Beytullah.hrms.core.entities.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "candidates")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="user_id", referencedColumnName = "user_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidateCv"})
public class Candidate extends User {

    @NotNull
    @NotBlank
    @Pattern(regexp = "^\\d{11}$", message = "National identity must be 11 digits")
    @Column(name = "national_identity")
    private String nationalIdentity;

    @NotNull
    @NotBlank
    @Size(max = 50)
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @NotBlank
    @Size(max = 50)
    @Column(name = "last_name")
    private String lastName;

    /*
    @NotNull
    @Past
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
*/
    @OneToOne(mappedBy = "candidate")
    private CandidateCv candidateCv;
}
package Beytullah.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
@Entity
@Table(name = "candidate_cv_educations")
@AllArgsConstructor
@NoArgsConstructor
public class CandidateCollege {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @NotBlank
    @Size(max = 100)
    @Column(name = "school_name")
    private String schoolName;

    @NotNull
    @NotBlank
    @Size(max = 100)
    @Column(name = "department_name")
    private String departmentName;

    @NotNull
    @Past
    @Column(name = "starting_date")
    private Date startingDate;

    @Past
    @Column(name = "date_of_graduation")
    private Date dateOfGraduation;

    @ManyToOne()
    @JoinColumn(name = "candidate_cv_id")
    private CandidateCv candidateCv;

}

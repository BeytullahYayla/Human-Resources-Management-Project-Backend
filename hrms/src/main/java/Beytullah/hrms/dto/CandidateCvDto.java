package Beytullah.hrms.dto;

import Beytullah.hrms.entities.concretes.CandidateExperience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateCvDto {
    private String email;
    private String firstName;
    private String lastName;
    private String nationalityNumber;
    private int yearOfBirth;


    //private String firstName;
    //private String lastname;

}

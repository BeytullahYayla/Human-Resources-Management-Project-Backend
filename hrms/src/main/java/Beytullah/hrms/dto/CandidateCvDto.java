package Beytullah.hrms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

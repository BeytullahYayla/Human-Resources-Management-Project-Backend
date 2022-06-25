package Beytullah.hrms.dto;

import Beytullah.hrms.entities.concretes.JobAdvertisement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class JobAdvertisementDto {
    private String companyName;
    //private String positionName;
    private int requiredPositionCount;
    private Date createdAt;
    private Date applicationDeadline;




}

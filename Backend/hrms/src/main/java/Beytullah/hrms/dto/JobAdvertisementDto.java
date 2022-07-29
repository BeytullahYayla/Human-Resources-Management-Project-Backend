package Beytullah.hrms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {
    private String companyName;
    private String positionName;
    private int requiredPositionCount;
    private Date createdAt;
    private Date applicationDeadline;


}

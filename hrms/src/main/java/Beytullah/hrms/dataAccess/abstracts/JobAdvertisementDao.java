package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.dto.JobAdvertisementDto;
import Beytullah.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
    @Query("SELECT new Beytullah.hrms.dto.JobAdvertisementDto(e.companyName , j.requiredPositionCount,j.createdAt,j.applicationDeadline) FROM Employer e JOIN e.employerId j")
    public List<JobAdvertisementDto> getJobAdvertisementDetails();

}

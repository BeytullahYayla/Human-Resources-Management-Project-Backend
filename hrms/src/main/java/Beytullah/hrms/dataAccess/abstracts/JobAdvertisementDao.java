package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.dto.JobAdvertisementDto;
import Beytullah.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
    @Query("SELECT new Beytullah.hrms.dto.JobAdvertisementDto(e.companyName,p.positionName,j.requiredPositionCount,j.createdAt,j.applicationDeadline)"+
            "FROM Employer e Inner Join e.jobAdvertisements j Inner Join j.position p")
    public List<JobAdvertisementDto> getJobAdvertisementDetails();


    @Query("SELECT new Beytullah.hrms.dto.JobAdvertisementDto(e.companyName,p.positionName,j.requiredPositionCount,j.createdAt,j.applicationDeadline)"+
            "FROM  Employer e Inner Join e.jobAdvertisements j Inner Join j.position p where j.createdAt=:date")
    public List<JobAdvertisementDto> getJobAdvertisementsByDate(Date date);

    @Query("SELECT new Beytullah.hrms.dto.JobAdvertisementDto(e.companyName,p.positionName,j.requiredPositionCount,j.createdAt,j.applicationDeadline)"+
            "FROM  Employer e Inner Join e.jobAdvertisements j Inner Join j.position p where e.companyName=:companyName")
    public List<JobAdvertisementDto> getByCompanyName(String companyName);

    @Query("SELECT new Beytullah.hrms.dto.JobAdvertisementDto(e.companyName,p.positionName,j.requiredPositionCount,j.createdAt,j.applicationDeadline)"+
            "FROM  Employer e Inner Join e.jobAdvertisements j Inner Join j.position p where j.isActive=:true")
    public List<JobAdvertisementDto> getActiveJobAdvertisements();




}

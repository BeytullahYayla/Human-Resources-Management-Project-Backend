package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.dto.CandidateCvDto;
import Beytullah.hrms.entities.concretes.CurriculumVitae;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateCvDao extends JpaRepository<CurriculumVitae,Integer> {
        Integer countByNationalityNumber(String nationalityNumber);
        @Query("SELECT new Beytullah.hrms.dto.CandidateCvDto "
                +"(u.email, c.firstName, c.lastName, c.nationalityNumber, c.yearOfBirth) "
                +"from CurriculumVitae c inner join c.user u ")
        List<CandidateCvDto> getAllDetails();

}

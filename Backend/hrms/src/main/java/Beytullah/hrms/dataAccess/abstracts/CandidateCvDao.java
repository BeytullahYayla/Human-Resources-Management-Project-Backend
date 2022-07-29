package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.dto.CandidateCvDto;
import Beytullah.hrms.entities.concretes.CandidateCv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateCvDao extends JpaRepository<CandidateCv,Integer> {
    //@Query("select new Beytullah.hrms.dto.CandidateCvDto(f.foreignLanguageName,cf.level) FROM CandidateCv c Inner Join c.candidateForeignLanguages cf Inner Join cf.foreignLanguage f")
    //public List<CandidateCvDto> getCandidateCvDetails();

    @Query("Select new Beytullah.hrms.dto.CandidateCvDto(c.coverLetter,e.companyName)" +
            "From CandidateCv c Inner Join c.candidateCvExperiences e")
    public List<CandidateCvDto> getCandidateCvDetails();
}

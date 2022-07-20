package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.CandidateExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateCvExperienceDao extends JpaRepository<CandidateExperience,Integer> {

    public List<CandidateExperience> getByCandidateCv_IdOrderByQuitYearDesc(int candidateCvId);

}

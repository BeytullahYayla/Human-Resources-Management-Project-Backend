package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.CandidateExperience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateCvExperienceDao extends JpaRepository<CandidateExperience,Integer> {

}

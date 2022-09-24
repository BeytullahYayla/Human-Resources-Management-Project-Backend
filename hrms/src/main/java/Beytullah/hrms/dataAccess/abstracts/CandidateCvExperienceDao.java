package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateCvExperienceDao extends JpaRepository<Experience,Integer> {

   public List<Experience> getByCandidate_IdOrderByEndYearDesc(int candidateId);

}

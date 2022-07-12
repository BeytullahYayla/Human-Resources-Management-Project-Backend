package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.ApplicantCvWebsite;
import Beytullah.hrms.entities.concretes.ApplicantJobExperience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantCvExperienceDao extends JpaRepository<ApplicantJobExperience,Integer> {
}

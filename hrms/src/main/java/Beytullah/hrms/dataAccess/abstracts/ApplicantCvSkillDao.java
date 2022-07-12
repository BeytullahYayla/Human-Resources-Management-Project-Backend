package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.ApplicantCvSkills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantCvSkillDao extends JpaRepository<ApplicantCvSkills,Integer> {

}

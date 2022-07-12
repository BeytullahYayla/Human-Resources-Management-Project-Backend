package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.ApplicantCvWebsite;
import Beytullah.hrms.entities.concretes.ApplicantForeignLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantCvForeignLanguageDao extends JpaRepository<ApplicantForeignLanguage,Integer> {
}

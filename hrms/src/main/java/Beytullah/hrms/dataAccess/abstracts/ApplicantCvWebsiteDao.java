package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.ApplicantCvWebsite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantCvWebsiteDao extends JpaRepository<ApplicantCvWebsite,Integer> {
}

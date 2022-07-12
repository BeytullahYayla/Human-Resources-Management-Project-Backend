package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.ApplicantCv;
import Beytullah.hrms.entities.concretes.ApplicantCvWebsite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantCvDao extends JpaRepository<ApplicantCv,Integer> {
}

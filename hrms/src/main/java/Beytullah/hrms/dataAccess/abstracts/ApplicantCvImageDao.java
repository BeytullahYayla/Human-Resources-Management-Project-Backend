package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.ApplicantCvWebsite;
import Beytullah.hrms.entities.concretes.ApplicantImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantCvImageDao extends JpaRepository<ApplicantImage,Integer> {
}

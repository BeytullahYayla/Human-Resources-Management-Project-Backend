package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.CandidateCv;
import Beytullah.hrms.entities.concretes.CandidateCvWebsite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateCvWebsiteDao extends JpaRepository<CandidateCvWebsite,Integer> {

}

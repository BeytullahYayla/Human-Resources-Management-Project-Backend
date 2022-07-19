package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.CandidateCvImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateCvImageDao extends JpaRepository<CandidateCvImage,Integer> {

}

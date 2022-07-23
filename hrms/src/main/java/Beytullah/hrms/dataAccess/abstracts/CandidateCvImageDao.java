package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.CandidateCvImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateCvImageDao extends JpaRepository<CandidateCvImage,Integer> {
    List<CandidateCvImage> getByCandidateCv_Id(int candidateCvId);


}

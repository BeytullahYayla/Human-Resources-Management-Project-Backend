package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.CandidateCollege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateCollegeDao extends JpaRepository<CandidateCollege,Integer> {

}

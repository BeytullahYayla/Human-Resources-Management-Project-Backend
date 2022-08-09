package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.CandidateCollege;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateCollegeDao extends JpaRepository<CandidateCollege,Integer> {
    //List<CandidateCollege> getByCandidateCv_Id(int id);
    //List<CandidateCollege> getByCandidateCv_IdOrderByYearOfGraduationDesc(int id);

}

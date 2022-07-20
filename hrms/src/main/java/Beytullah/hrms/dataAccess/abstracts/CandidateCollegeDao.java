package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.Candidate;
import Beytullah.hrms.entities.concretes.CandidateCollege;
import Beytullah.hrms.entities.concretes.CandidateCv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateCollegeDao extends JpaRepository<CandidateCollege,Integer> {
    List<CandidateCollege> getByCandidateCv_Id(int candidateCvId);
    List<CandidateCollege> getByCandidateCv_IdOrderByGraduationYearDesc(int candidateCvId);

}

package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateCollegeDao extends JpaRepository<Education,Integer> {
    //List<CandidateCollege> getByCandidateCv_Id(int id);
    //List<CandidateCollege> getByCandidateCv_IdOrderByYearOfGraduationDesc(int id);

}

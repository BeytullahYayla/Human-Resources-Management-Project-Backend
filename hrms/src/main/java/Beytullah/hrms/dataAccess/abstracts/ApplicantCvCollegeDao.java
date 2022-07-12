package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.ApplicantCollege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantCvCollegeDao extends JpaRepository<ApplicantCollege,Integer> {

}

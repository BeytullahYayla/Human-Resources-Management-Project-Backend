
package Beytullah.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Beytullah.hrms.entities.concretes.JobSeekers;
public interface JobSeekersDao extends JpaRepository<JobSeekers,Integer>{
	JobSeekers findByNationalIdentityNo(String nationalIdentityNo);
	JobSeekers findByEmail(String email);
}

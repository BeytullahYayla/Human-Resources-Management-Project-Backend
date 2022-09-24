
package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekersDao extends JpaRepository<JobSeeker,Integer>{
	JobSeeker findByNationalIdentityNo(String nationalIdentityNo);
	JobSeeker findByEmail(String email);
}

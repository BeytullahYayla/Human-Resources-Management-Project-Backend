
package Beytullah.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Beytullah.hrms.entities.concretes.JobSeeker;
public interface JobSeekersDao extends JpaRepository<JobSeeker,Integer>{
	JobSeeker findByNationalIdentityNo(String nationalIdentityNo);
	JobSeeker findByEmail(String email);
}

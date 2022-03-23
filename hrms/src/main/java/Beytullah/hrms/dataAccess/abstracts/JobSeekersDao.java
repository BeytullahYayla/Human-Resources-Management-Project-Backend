
package Beytullah.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Beytullah.hrms.entities.concretes.JobSeekers;
public interface JobSeekersDao extends JpaRepository<JobSeekers,Integer>{

}

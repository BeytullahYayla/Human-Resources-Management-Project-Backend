package Beytullah.hrms.business.abstracts;

import java.util.List;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	
	DataResult<List<JobSeeker>> getAll();
	Result add(JobSeeker jobSeeker);
	DataResult<JobSeeker> getByNationalIdentityNo(String nationalIdentityNo);
	DataResult<JobSeeker> getByEmail(String email);
}

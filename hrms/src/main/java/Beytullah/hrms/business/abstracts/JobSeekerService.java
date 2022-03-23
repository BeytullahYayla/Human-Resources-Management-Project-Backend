package Beytullah.hrms.business.abstracts;

import java.util.List;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.JobSeekers;
public interface JobSeekerService {
	
	DataResult<List<JobSeekers>> getAll();
	Result add(JobSeekers jobSeeker);

}

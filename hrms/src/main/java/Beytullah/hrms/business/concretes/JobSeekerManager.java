package Beytullah.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Beytullah.hrms.business.abstracts.JobSeekerService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import Beytullah.hrms.dataAccess.abstracts.JobSeekersDao;
import Beytullah.hrms.entities.concretes.JobSeekers;

public class JobSeekerManager implements JobSeekerService {
	
	private JobSeekersDao jobSeekersDao;
	@Autowired
	public JobSeekerManager(JobSeekersDao jobSeekersDao) {
		this.jobSeekersDao=jobSeekersDao;
	}

	//Mernis validation 
	@Override
	public DataResult<List<JobSeekers>> getAll() {
		
		return new SuccessDataResult<List<JobSeekers>>(this.jobSeekersDao.findAll(),"Job Seekers Listed Successfully");
	}

	@Override
	public Result add(JobSeekers jobSeeker) {
		
		this.jobSeekersDao.save(jobSeeker);
		return new SuccessResult("Job Seeker Added Successfully");
	}

} 

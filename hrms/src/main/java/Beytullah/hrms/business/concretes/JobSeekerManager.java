package Beytullah.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Beytullah.hrms.business.abstracts.JobSeekerService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.ErrorResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import Beytullah.hrms.dataAccess.abstracts.JobSeekersDao;
import Beytullah.hrms.entities.concretes.JobSeekers;

@Service
public class JobSeekerManager implements JobSeekerService {
	
	private JobSeekersDao jobSeekersDao;
	@Autowired
	public JobSeekerManager(JobSeekersDao jobSeekersDao) {
		this.jobSeekersDao=jobSeekersDao;
	}

	//Mernis validation 
	
	public DataResult<List<JobSeekers>> getAll() {
		
		return new SuccessDataResult<List<JobSeekers>>(this.jobSeekersDao.findAll(),"Job Seekers Listed Successfully");
	}

	@Override
	public Result add(JobSeekers jobSeeker) {
		if(checkIfIdentityNumberExists(jobSeeker.getNationalIdentityNo())|| checkIfEmailExists(jobSeeker.getEmail())) {
			return new ErrorResult("Identity Number or Email Already Exists....\n Please Try Again");
		}
		this.jobSeekersDao.save(jobSeeker);
		return new SuccessResult("Job Seeker Added Successfully");
	}

	@Override
	public DataResult<JobSeekers> getByNationalIdentityNo(String nationalIdentityNo) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<JobSeekers>(this.jobSeekersDao.findByNationalIdentityNo(nationalIdentityNo));
	}
	
	

	@Override
	public DataResult<JobSeekers> getByEmail(String email) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<JobSeekers>(this.jobSeekersDao.findByEmail(email));
	}
	private boolean checkIfIdentityNumberExists(String IdentityNumber) {
		if(this.jobSeekersDao.findByNationalIdentityNo(IdentityNumber)!=null) {
			return true;
		}
		return false;
	}
	private boolean checkIfEmailExists(String email) {
		if(this.jobSeekersDao.findByEmail(email)!=null) {
			return true;
		}
		return false;
	}


	

} 

package Beytullah.hrms.business.concretes;

import java.util.List;

import Beytullah.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Beytullah.hrms.business.abstracts.JobSeekerService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.ErrorResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import Beytullah.hrms.dataAccess.abstracts.JobSeekersDao;

@Service
public class JobSeekerManager implements JobSeekerService {
	
	private JobSeekersDao jobSeekersDao;
	@Autowired
	public JobSeekerManager(JobSeekersDao jobSeekersDao) {
		this.jobSeekersDao=jobSeekersDao;
	}

	//Mernis validation 
	
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekersDao.findAll(),"Job Seekers Listed Successfully");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		if(checkIfIdentityNumberExists(jobSeeker.getIdentityNo())|| checkIfEmailExists(jobSeeker.getEmail())) {
			return new ErrorResult("Identity Number or Email Already Exists....\n Please Try Again");
		}
		this.jobSeekersDao.save(jobSeeker);
		return new SuccessResult("Job Seeker Added Successfully");
	}

	@Override
	public DataResult<JobSeeker> getByNationalIdentityNo(String nationalIdentityNo) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<JobSeeker>(this.jobSeekersDao.findByNationalIdentityNo(nationalIdentityNo));
	}
	
	

	@Override
	public DataResult<JobSeeker> getByEmail(String email) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<JobSeeker>(this.jobSeekersDao.findByEmail(email));
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

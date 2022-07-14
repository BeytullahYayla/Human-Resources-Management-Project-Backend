package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.ApplicantCvCollegeService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantCvCollegeManager implements ApplicantCvCollegeService {
    ApplicantCvCollegeDao applicantCvCollegeDao;
    public ApplicantCvCollegeManager(ApplicantCvCollegeDao applicantCvCollegeDao) {
        this.applicantCvCollegeDao = applicantCvCollegeDao;
    }



    @Override
    public DataResult<List<ApplicantCollege>> listAll() {
        return new SuccessDataResult<List<ApplicantCollege>>(this.applicantCvCollegeDao.findAll(),"Colleges Listed Successfully");
    }

    @Override
    public Result add(ApplicantCollege applicantCollege) {
        this.applicantCvCollegeDao.save(applicantCollege);
        return new SuccessResult("College Saved Successfully");
    }
}

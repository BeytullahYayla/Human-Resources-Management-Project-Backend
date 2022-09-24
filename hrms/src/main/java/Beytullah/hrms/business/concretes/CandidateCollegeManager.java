package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.CandidateCollegeService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import Beytullah.hrms.dataAccess.abstracts.CandidateCollegeDao;
import Beytullah.hrms.entities.concretes.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateCollegeManager implements CandidateCollegeService {
    CandidateCollegeDao candidateCollegeDao;
    @Autowired
    public CandidateCollegeManager(CandidateCollegeDao candidateCollegeDao) {
        this.candidateCollegeDao = candidateCollegeDao;
    }



    @Override
    public DataResult<List<Education>> getAll() {
        return new SuccessDataResult<List<Education>>(this.candidateCollegeDao.findAll(),"Candidate Colleges Listed");
    }

    @Override
    public Result add(Education candidateCollege) {
        this.candidateCollegeDao.save(candidateCollege);
        return new SuccessResult("Candidate College Added Successfully");
    }

    /*

    @Override
    public DataResult<List<CandidateCollege>> getByCandidateCvId(int candidateCvId) {
        return new SuccessDataResult<List<CandidateCollege>>(this.candidateCollegeDao.getByCandidateCv_Id(candidateCvId),"Candidate Colleges Listed By Graduation Year Successfully!!");
    }
    */

}

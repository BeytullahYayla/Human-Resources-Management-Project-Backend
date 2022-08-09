package Beytullah.hrms.business.concretes;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import Beytullah.hrms.dataAccess.abstracts.CandidateCvExperienceDao;
import Beytullah.hrms.entities.concretes.CandidateExperience;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateCvExperienceManager implements Beytullah.hrms.business.abstracts.CandidateCvExperienceService {
    CandidateCvExperienceDao candidateCvExperienceDao;
    public CandidateCvExperienceManager(CandidateCvExperienceDao candidateCvExperienceDao){
        this.candidateCvExperienceDao=candidateCvExperienceDao;
    }
    @Override
    public DataResult<List<CandidateExperience>> getAll() {
        return new SuccessDataResult<List<CandidateExperience>>(this.candidateCvExperienceDao.findAll(),"Experiences Listed Successfully");
    }

   // @Override
    //public DataResult<List<CandidateExperience>> getByCandidateCvQuitYear(int candidateCvId) {
     //   return new SuccessDataResult<List<CandidateExperience>>(this.candidateCvExperienceDao.getByCandidateCv_IdOrderByEndYearDesc(candidateCvId),"Experiences Listed By Quit Years");
    //}

    @Override
    public Result add(CandidateExperience candidateExperience) {





        this.candidateCvExperienceDao.save(candidateExperience);
        return new SuccessResult("Candidate Experience Added Successfully");
    }
}

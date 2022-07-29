package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.CandidateService;
import Beytullah.hrms.core.utilities.results.*;
import Beytullah.hrms.dataAccess.abstracts.CandidateDao;
import Beytullah.hrms.entities.concretes.Candidate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {
    private CandidateDao candidateDao;
    public CandidateManager(CandidateDao candidateDao){
        this.candidateDao=candidateDao;
    }
    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"Candidates Listed Successfully");
    }

    @Override
    public DataResult<Candidate> getById(int id) {
        return new SuccessDataResult<Candidate>(this.candidateDao.findById(id).get());
    }

    @Override
    public DataResult<Candidate> getByNationalIdentity(String nationalIdentity) {
        return new SuccessDataResult<Candidate>(this.candidateDao.getByNationalIdentity(nationalIdentity));
    }

    @Override
    public DataResult<Candidate> getByEmail(String email) {
        return new SuccessDataResult<Candidate>(this.candidateDao.getByEmail(email));
    }

    @Override
    public Result add(Candidate candidate) {
        this.candidateDao.save(candidate);
        return new SuccessResult("Candidate Added Successfully");
    }

    @Override
    public Result update(Candidate candidate) {
        if(ifCandidateExistsById(candidate.getId())){

            this.candidateDao.save(candidate);
            return new SuccessResult("Candidate Updated Successfully");
        }
        return new ErrorResult("Candidate Couldn't Found at Database");
    }

    @Override
    public Result delete(Candidate candidate) {
        return new SuccessResult("Candidate Deleted Successfully");
    }

    private boolean ifCandidateExistsById(int candidateId){


        //If there is a candidate that has candidateId return true
        return this.candidateDao.existsById(candidateId)?true:false;
    }
}

package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.CandidateService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import Beytullah.hrms.dataAccess.abstracts.CandidateDao;
import Beytullah.hrms.entities.concretes.Candidate;

import java.util.List;

public class CandidateManager implements CandidateService {
    private CandidateDao candidateDao;
    public CandidateManager(CandidateDao candidateDao){
        this.candidateDao=candidateDao;
    }
    @Override
    public DataResult<List<Candidate>> getAll() {
        return null;
    }

    @Override
    public DataResult<Candidate> getById(int id) {
        return new SuccessDataResult<Candidate>(this.candidateDao.findById(id).get());
    }

    @Override
    public DataResult<Candidate> getByNationalIdentity(String nationalIdentity) {
        return null;
    }

    @Override
    public DataResult<Candidate> getByEmail(String email) {
        return null;
    }

    @Override
    public Result add(Candidate candidate) {
        return null;
    }

    @Override
    public Result update(Candidate candidate) {
        return null;
    }

    @Override
    public Result delete(Candidate candidate) {
        return null;
    }
}

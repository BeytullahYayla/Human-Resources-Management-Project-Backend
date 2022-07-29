package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {
    DataResult<List<Candidate>> getAll();
    DataResult<Candidate> getById(int id);
    DataResult<Candidate> getByNationalIdentity(String nationalIdentity);
    DataResult<Candidate> getByEmail(String email);
    Result add(Candidate candidate);
    Result update(Candidate candidate);
    Result delete(Candidate candidate);
}

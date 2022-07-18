package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.CandidateCollege;

import java.util.List;


public interface CandidateCollegeService {
    DataResult<List<CandidateCollege>> getAll();
    Result add(CandidateCollege candidateCollege);
}

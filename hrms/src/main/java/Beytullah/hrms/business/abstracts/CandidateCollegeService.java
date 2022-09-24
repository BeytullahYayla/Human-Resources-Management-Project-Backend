package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.Education;

import java.util.List;


public interface CandidateCollegeService {
    DataResult<List<Education>> getAll();

    Result add(Education candidateCollege);

    /*
    DataResult<List<CandidateCollege>> getByCandidateCvId(int candidateCvId);
    */

}

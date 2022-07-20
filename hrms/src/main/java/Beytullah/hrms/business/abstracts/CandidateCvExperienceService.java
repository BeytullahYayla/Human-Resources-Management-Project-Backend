package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.CandidateExperience;

import java.util.List;

public interface CandidateCvExperienceService {
    DataResult<List<CandidateExperience>> getAll();
    DataResult<List<CandidateExperience>> getByCandidateCvQuitYear(int candidateCvId);
    Result add(CandidateExperience candidateExperience);
}

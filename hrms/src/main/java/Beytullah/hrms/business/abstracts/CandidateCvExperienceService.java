package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.Experience;

import java.util.List;

public interface CandidateCvExperienceService {
    DataResult<List<Experience>> getAll();
    DataResult<List<Experience>> getByCandidateCvQuitYear(int candidateCvId);
    Result add(Experience candidateExperience);
}

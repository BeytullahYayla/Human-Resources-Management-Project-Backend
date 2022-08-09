package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;

import Beytullah.hrms.entities.concretes.Talent;

import java.util.List;

public interface CandidateCvSkillService {
    DataResult<List<Talent>> getAll();
    Result add(Talent candidateCvSkill);
}

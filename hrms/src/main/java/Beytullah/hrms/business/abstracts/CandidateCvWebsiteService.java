package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.CandidateCvWebsite;

import java.util.List;

public interface CandidateCvWebsiteService {
    DataResult<List<CandidateCvWebsite>> getAll();
    Result add(CandidateCvWebsite candidateCvWebsite);
}

package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.dataAccess.abstracts.CandidateForeignLanguageDao;
import Beytullah.hrms.entities.concretes.CandidateForeignLanguage;

import java.util.List;

public interface CandidateForeignLanguageService {

    DataResult<List<CandidateForeignLanguage>> getAll();
    Result add(CandidateForeignLanguage candidateForeignLanguage);

}

package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.Language;

import java.util.List;

public interface CandidateForeignLanguageService {

    DataResult<List<Language>> getAll();
    Result add(Language candidateForeignLanguage);

}

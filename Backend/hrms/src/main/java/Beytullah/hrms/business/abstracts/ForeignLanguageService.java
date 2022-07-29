package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.Language;

import java.util.List;

public interface ForeignLanguageService {
    DataResult<List<Language>> listAll();
    Result add(Language foreignLanguage);
}

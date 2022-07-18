package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.ForeignLanguageService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import Beytullah.hrms.dataAccess.abstracts.ForeignLanguageDao;
import Beytullah.hrms.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForeignLanguageManager implements ForeignLanguageService {
    ForeignLanguageDao foreignLanguageDao;
    public ForeignLanguageManager(ForeignLanguageDao foreignLanguageDao){
        this.foreignLanguageDao=foreignLanguageDao;

    }

    @Override
    public DataResult<List<Language>> listAll() {
        return new SuccessDataResult<List<Language>>(this.foreignLanguageDao.findAll(),"ListedSuccessfully");
    }

    @Override
    public Result add(Language foreignLanguage) {
        this.foreignLanguageDao.save(foreignLanguage);
        return new SuccessResult("Added Successfully");
    }
}

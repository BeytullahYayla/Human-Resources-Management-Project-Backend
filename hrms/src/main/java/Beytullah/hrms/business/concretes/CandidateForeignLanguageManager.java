package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.CandidateForeignLanguageService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import Beytullah.hrms.dataAccess.abstracts.CandidateForeignLanguageDao;
import Beytullah.hrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateForeignLanguageManager implements CandidateForeignLanguageService {
    CandidateForeignLanguageDao candidateForeignLanguageDao;
    @Autowired
    public CandidateForeignLanguageManager(CandidateForeignLanguageDao candidateForeignLanguageDao){
        super();
        this.candidateForeignLanguageDao=candidateForeignLanguageDao;
    }

    @Override
    public DataResult<List<Language>> getAll() {
        return new SuccessDataResult<List<Language>>(this.candidateForeignLanguageDao.findAll(),"Data Listed Successfully");
    }

    @Override
    public Result add(Language candidateForeignLanguage) {
        this.candidateForeignLanguageDao.save(candidateForeignLanguage);
        return new SuccessResult("Foreign Language Added Successfully");
    }
}

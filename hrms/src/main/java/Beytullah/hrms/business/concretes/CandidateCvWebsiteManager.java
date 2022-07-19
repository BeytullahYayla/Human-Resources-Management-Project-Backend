package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.CandidateCvWebsiteService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import Beytullah.hrms.dataAccess.abstracts.CandidateCvWebsiteDao;
import Beytullah.hrms.entities.concretes.Candidate;
import Beytullah.hrms.entities.concretes.CandidateCvWebsite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CandidateCvWebsiteManager implements CandidateCvWebsiteService {

    CandidateCvWebsiteDao candidateCvWebsiteDao;
    @Autowired
    public CandidateCvWebsiteManager(CandidateCvWebsiteDao candidateCvWebsiteDao) {
        this.candidateCvWebsiteDao = candidateCvWebsiteDao;
    }


    @Override
    public DataResult<List<CandidateCvWebsite>> getAll() {
        return new SuccessDataResult<List<CandidateCvWebsite>>(this.candidateCvWebsiteDao.findAll(),"Candidate Cv Websites Listed Successfully");
    }

    @Override
    public Result add(CandidateCvWebsite candidateCvWebsite) {
        this.candidateCvWebsiteDao.save(candidateCvWebsite);
        return new SuccessResult("Candidate Website Added Successfully");
    }
}

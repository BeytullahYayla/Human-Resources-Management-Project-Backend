package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.CandidateCvService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import Beytullah.hrms.dataAccess.abstracts.CandidateCvDao;
import Beytullah.hrms.dto.CandidateCvDto;
import Beytullah.hrms.entities.concretes.CurriculumVitae;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateCvManager implements CandidateCvService {

    CandidateCvDao candidateCvDao;
    @Autowired
    public CandidateCvManager(CandidateCvDao candidateCvDao) {
        this.candidateCvDao = candidateCvDao;
    }



    @Override
    public DataResult<List<CurriculumVitae>> getAll() {
        return new SuccessDataResult<List<CurriculumVitae>>(this.candidateCvDao.findAll(),"Data Listed Successfully");
    }

    @Override
    public DataResult<List<CandidateCvDto>> getDetails() {
        return new SuccessDataResult<List<CandidateCvDto>>(this.candidateCvDao.getAllDetails(),"Details Listed");
    }

    /*
    @Override
    public DataResult<List<CandidateCvDto>> getDetails() {
        return new SuccessDataResult<List<CandidateCvDto>>(this.candidateCvDao.getCandidateCvDetails(),"Details Listed Successfully");
    }
    */


    @Override
    public Result add(CurriculumVitae candidateCv) {
        this.candidateCvDao.save(candidateCv);
        return new SuccessResult("Added Successfully");
    }
}

package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.CandidateCvSkillService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import Beytullah.hrms.dataAccess.abstracts.CandidateCvSkillDao;
import Beytullah.hrms.entities.concretes.CandidateCvSkill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateCvSkillManager implements CandidateCvSkillService {
    CandidateCvSkillDao candidateCvSkillDao;
    public CandidateCvSkillManager(CandidateCvSkillDao candidateCvSkillDao) {
        this.candidateCvSkillDao = candidateCvSkillDao;
    }

    @Override
    public DataResult<List<CandidateCvSkill>> getAll() {
        return new SuccessDataResult<List<CandidateCvSkill>>(this.candidateCvSkillDao.findAll(),"Skills listed successfully");
    }

    @Override
    public Result add(CandidateCvSkill candidateCvSkill) {
        this.candidateCvSkillDao.save(candidateCvSkill);
        return new SuccessResult("Added successfully");
    }
}

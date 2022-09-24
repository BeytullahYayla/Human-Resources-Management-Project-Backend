package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.dto.CandidateCvDto;
import Beytullah.hrms.entities.concretes.CurriculumVitae;

import java.util.List;

public interface CandidateCvService {
    DataResult<List<CurriculumVitae>> getAll();

    DataResult<List<CandidateCvDto>> getDetails();
    Result add(CurriculumVitae curriculumVitae);
}

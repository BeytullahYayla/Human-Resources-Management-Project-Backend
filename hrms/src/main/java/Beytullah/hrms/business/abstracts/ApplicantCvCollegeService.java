package Beytullah.hrms.business.abstracts;


import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.ApplicantCollege;

import java.util.List;

public interface ApplicantCvCollegeService {
    DataResult<List<ApplicantCollege>> listAll();
    Result add(ApplicantCollege applicantCollege);

}

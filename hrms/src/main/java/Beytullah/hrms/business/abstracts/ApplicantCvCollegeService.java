package Beytullah.hrms.business.abstracts;


import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;

import java.util.List;

public interface ApplicantCvCollegeService {
    DataResult<List<ApplicantCollege>> listAll();
    Result add(ApplicantCollege applicantCollege);

}

package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;

import java.util.List;

public interface ApplicantService {
    DataResult<List<Applicant>> getAll();
}

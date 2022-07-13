package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.entities.concretes.Applicant;

import java.util.List;

public interface ApplicantService {
    DataResult<List<Applicant>> getAll();
}

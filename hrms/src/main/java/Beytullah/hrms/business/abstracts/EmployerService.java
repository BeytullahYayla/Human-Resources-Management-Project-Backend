package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> listAll();

    DataResult<List<Employer>> getAllWithPagination(int pageNumber, int pageSize);
    Result add(Employer employer);
}

package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.Employers;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employers>> listAll();
    Result add(Employers employer);
}

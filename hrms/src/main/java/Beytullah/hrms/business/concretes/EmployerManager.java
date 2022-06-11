package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.EmployerService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.dataAccess.abstracts.EmployersDao;
import Beytullah.hrms.entities.concretes.Employers;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployerManager implements EmployerService {
    EmployersDao employerDao;
    public EmployerManager(EmployersDao employerDao){
        this.employerDao=employerDao;
    }
    @Override
    public DataResult<List<Employers>> listAll() {

        return new SuccessDataResult<List<Employers>>(this.employerDao.findAll());


    }
}

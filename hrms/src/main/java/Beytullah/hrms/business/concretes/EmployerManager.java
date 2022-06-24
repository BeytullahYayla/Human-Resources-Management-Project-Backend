package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.EmployerService;
import Beytullah.hrms.core.utilities.results.*;
import Beytullah.hrms.dataAccess.abstracts.EmployersDao;
import Beytullah.hrms.entities.concretes.Employer;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import java.util.List;
@Service
public class EmployerManager implements EmployerService {
    EmployersDao employerDao;
    public EmployerManager(EmployersDao employerDao){
        this.employerDao=employerDao;
    }
    @Override
    public DataResult<List<Employer>> listAll() {

        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());


    }

    @Override
    public DataResult<List<Employer>> getAllWithPagination(int pageNumber, int pageSize) {
        Pageable pageable= PageRequest.of(pageNumber, pageSize);
        return new SuccessDataResult<>(this.employerDao.findAll(pageable).getContent());
    }

    @Override
    public Result add(Employer employer) {
        if(checkIfEmailExists(employer) && hrmsValidation(employer)){
            employerDao.save(employer);
            return new SuccessResult("Employer Added Successfully");
        }
        return new ErrorResult("Something went wrong while saving employer");

    }




    private boolean checkIfEmailExists(Employer employer){
        if(this.employerDao.findByEmail(employer.getEmail())!=null){
            return false;
        }
        return true;

    }
    private boolean hrmsValidation(Employer employer){
        return true;//Just returns true for now
    }
}

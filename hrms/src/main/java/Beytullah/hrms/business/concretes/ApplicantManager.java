package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.ApplicantService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.dataAccess.abstracts.ApplicantDao;
import Beytullah.hrms.entities.concretes.Applicant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantManager implements ApplicantService {

    ApplicantDao applicantDao;
    public ApplicantManager(ApplicantDao applicantDao){
        this.applicantDao=applicantDao;
    }

    @Override
    public DataResult<List<Applicant>> getAll() {
        return new SuccessDataResult<List<Applicant>>(this.applicantDao.findAll());
    }
}

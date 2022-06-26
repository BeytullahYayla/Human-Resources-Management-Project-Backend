package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.JobAdvertisementService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import Beytullah.hrms.dataAccess.abstracts.JobAdvertisementDao;
import Beytullah.hrms.dto.JobAdvertisementDto;
import Beytullah.hrms.entities.concretes.JobAdvertisement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
    private JobAdvertisementDao jobAdvertisementDao;
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }


    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"Listed Successfully");

    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {

        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("Job Advertisement Saved Successfully");
    }


    @Override
    public DataResult<List<JobAdvertisementDto>> getAdvertisementDto() {

        return new SuccessDataResult<List<JobAdvertisementDto>>(this.jobAdvertisementDao.getJobAdvertisementDetails(),"Details Listed Successfully");
    }


}

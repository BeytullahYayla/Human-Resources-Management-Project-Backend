package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.dto.JobAdvertisementDto;
import Beytullah.hrms.entities.concretes.JobAdvertisement;

import java.util.Date;
import java.util.List;

public interface JobAdvertisementService {
    DataResult<List<JobAdvertisement>> getAll();
    Result add(JobAdvertisement jobAdvertisement);
    DataResult<List<JobAdvertisementDto>> getAdvertisementDto();

    DataResult<List<JobAdvertisementDto>> getAdvertisementDtoByDate(Date date);
    DataResult<List<JobAdvertisementDto>> getAdvertisementDtoByCompanyName(String companyName);

    DataResult<List<JobAdvertisementDto>> getActiveAdvertisements();

    Result changeIsActive(int id);
}

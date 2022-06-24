package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.JobAdvertisementService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.entities.concretes.JobAdvertisement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/JobAdvertisements")
public class JobAdvertisementController {

    private JobAdvertisementService jobAdvertisementService;
    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }



    @GetMapping("/getAll")
    public DataResult<List<JobAdvertisement>> getAll(){
       return this.jobAdvertisementService.getAll();
    }
}

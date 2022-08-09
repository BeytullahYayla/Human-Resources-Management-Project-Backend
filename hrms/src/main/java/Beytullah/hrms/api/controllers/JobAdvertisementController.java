package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.JobAdvertisementService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.dto.JobAdvertisementDto;
import Beytullah.hrms.entities.concretes.JobAdvertisement;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/JobAdvertisements")
@CrossOrigin
public class JobAdvertisementController {

    private JobAdvertisementService jobAdvertisementService;
    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }



    @GetMapping("/getAll")
    public DataResult<List<JobAdvertisement>> getAll(){
       return this.jobAdvertisementService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobAdvertisement jobAdvertisement){
        return this.jobAdvertisementService.add(jobAdvertisement);
    }

    @GetMapping("/getDetails")
    public DataResult<List<JobAdvertisementDto>> getDetails(){
        return this.jobAdvertisementService.getAdvertisementDto();
    }
    @GetMapping("/getDetailsByDate")
    public DataResult<List<JobAdvertisementDto>> getDetailsByDate(@RequestParam("date")
                                                                      @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date){
        return this.jobAdvertisementService.getAdvertisementDtoByDate(date);

    }
    @GetMapping("/getDetailsByCompanyName")
    public DataResult<List<JobAdvertisementDto>> getByCompanyName(@RequestParam String companyName){
        return this.jobAdvertisementService.getAdvertisementDtoByCompanyName(companyName);

    }
    @GetMapping("/getActiveJobAdvertisements")
    public DataResult<List<JobAdvertisementDto>> getActiveJobAdvertisements(){
        return this.jobAdvertisementService.getActiveAdvertisements();

    }

    @PostMapping("/changeActivityStatus")
    public Result changeActivityStatus(int id){
        return this.jobAdvertisementService.changeIsActive(id);

    }


}

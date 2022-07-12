package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.ApplicantCvCollegeService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.entities.concretes.ApplicantCollege;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
@RequestMapping("/api/College")

public class ApplicantCvCollegeController {
    ApplicantCvCollegeService applicantCvCollegeService;
    public ApplicantCvCollegeController(ApplicantCvCollegeService applicantCvCollegeService) {
        this.applicantCvCollegeService = applicantCvCollegeService;
    }
    @GetMapping("/getAll")
    public DataResult<List<ApplicantCollege>> getAll(){
        return this.applicantCvCollegeService.listAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody ApplicantCollege applicantCollege){
        return this.applicantCvCollegeService.add(applicantCollege);

    }


}

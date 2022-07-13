package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.ApplicantService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.entities.concretes.Applicant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicantController {
    ApplicantService applicantService;
    public ApplicantController(ApplicantService applicantService){
        this.applicantService=applicantService;
    }
    @GetMapping("/getAll")
    public DataResult<List<Applicant>> getAll(){
        return this.applicantService.getAll();
    }
}

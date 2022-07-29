package Beytullah.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import Beytullah.hrms.business.abstracts.CandidateService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    private CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping(value = "/getall")
    public DataResult<List<Candidate>> getAll(){
        return this.candidateService.getAll();
    }

    @PostMapping(value = "/add")
    public Result add(@Valid @RequestBody Candidate candidate){
        return this.candidateService.add(candidate);
    }

    @PostMapping(value = "/update")
    public Result update(@Valid @RequestBody Candidate candidate) {
        return this.candidateService.update(candidate);
    }

    @PostMapping(value = "/delete")
    public Result delete(@RequestBody Candidate candidate) {
        return this.candidateService.delete(candidate);
    }

    @GetMapping(value = "/getbyid")
    public DataResult<Candidate> getById(int id){
        return this.candidateService.getById(id);
    }

    @GetMapping(value = "/getbynationalidentity")
    public DataResult<Candidate> getByNationalIdentity(@RequestParam String nationalIdentity){
        return this.candidateService.getByNationalIdentity(nationalIdentity);
    }

    @GetMapping(value = "/getbyemail")
    public DataResult<Candidate> getByEmail(@RequestParam String email){
        return this.candidateService.getByEmail(email);
    }

}
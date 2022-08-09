package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.CandidateCollegeService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.CandidateCollege;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/CandidateCollege")
public class CandidateCollegeController {

    CandidateCollegeService candidateCollegeService;
    public CandidateCollegeController(CandidateCollegeService candidateCollegeService){
        this.candidateCollegeService=candidateCollegeService;

    }

    @GetMapping("/getAll")
    public DataResult<List<CandidateCollege>> getAll(){
        return this.candidateCollegeService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody CandidateCollege candidateCollege){
        return this.candidateCollegeService.add(candidateCollege);
    }
    /*
    @GetMapping("/getByCvId")
    public DataResult<List<CandidateCollege>> getByCvId(@RequestParam int candidateCvId){
        return this.candidateCollegeService.getByCandidateCvId(candidateCvId);
    }

     */

}

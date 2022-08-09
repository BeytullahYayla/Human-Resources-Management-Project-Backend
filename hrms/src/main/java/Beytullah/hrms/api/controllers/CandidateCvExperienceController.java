package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.CandidateCvExperienceService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.CandidateExperience;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/CandidateCvExperiences")

public class CandidateCvExperienceController {
    CandidateCvExperienceService candidateCvExperienceService;
    public CandidateCvExperienceController(CandidateCvExperienceService candidateCvExperienceService) {
        this.candidateCvExperienceService = candidateCvExperienceService;
    }
    @GetMapping("/getAll")
    public DataResult<List<CandidateExperience>> getAll(){
        return this.candidateCvExperienceService.getAll();
    }



    /*
    @GetMapping("/getByQuitYear")
    public DataResult<List<CandidateExperience>> getByQuitYear(@RequestParam int candidateCvId){
        return this.candidateCvExperienceService.getByCandidateCvQuitYear(candidateCvId);
    }

     */


    @PostMapping("/add")
    public Result add(@RequestBody CandidateExperience candidateExperience){
        return this.candidateCvExperienceService.add(candidateExperience);
    }



}

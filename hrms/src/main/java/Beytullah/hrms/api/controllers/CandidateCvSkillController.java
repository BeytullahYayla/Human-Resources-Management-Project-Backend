package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.CandidateCvSkillService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.entities.concretes.Candidate;
import Beytullah.hrms.entities.concretes.Talent;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Skills")
public class CandidateCvSkillController {
    CandidateCvSkillService candidateCvSkillService;
    public CandidateCvSkillController(CandidateCvSkillService candidateCvSkillService){
        this.candidateCvSkillService=candidateCvSkillService;
    }
    @GetMapping("/getAll")
    public DataResult<List<Talent>> getAll(){
        return this.candidateCvSkillService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Talent candidateCvSkill){
        return this.candidateCvSkillService.add(candidateCvSkill);
    }
}

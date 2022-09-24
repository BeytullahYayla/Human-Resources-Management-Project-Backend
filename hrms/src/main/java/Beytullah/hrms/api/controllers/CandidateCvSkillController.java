package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.CandidateCvSkillService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.Skill;
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
    public DataResult<List<Skill>> getAll(){
        return this.candidateCvSkillService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Skill candidateCvSkill){
        return this.candidateCvSkillService.add(candidateCvSkill);
    }
}

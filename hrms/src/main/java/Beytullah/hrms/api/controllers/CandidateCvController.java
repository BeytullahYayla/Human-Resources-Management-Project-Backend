package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.CandidateCvService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.dto.CandidateCvDto;
import Beytullah.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/CandidateCv")
public class CandidateCvController {
    CandidateCvService candidateCvService;
    @Autowired
    public CandidateCvController(CandidateCvService candidateCvService){
        super();
        this.candidateCvService=candidateCvService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Candidate>> getAll(){
        return this.candidateCvService.getAll();
    }


    @GetMapping("/getDetails")
    public DataResult<List<CandidateCvDto>> getDetails(){
        return this.candidateCvService.getDetails();
    }



    @PostMapping("/addCandidateCv")
    public Result add(@Valid @RequestBody Candidate candidateCv){
        return this.candidateCvService.add(candidateCv);
    }
}

package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.CandidateForeignLanguageService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.CandidateForeignLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/CandidateForeignLanguage")
public class CandidateForeignLanguageController {
    CandidateForeignLanguageService candidateForeignLanguageService;
    @Autowired
    public CandidateForeignLanguageController(CandidateForeignLanguageService candidateForeignLanguageService){
        super();
        this.candidateForeignLanguageService=candidateForeignLanguageService;
    }

    @GetMapping("/getAll")
    public DataResult<List<CandidateForeignLanguage>> getAll(){
       return this.candidateForeignLanguageService.getAll();
    }
    @PostMapping("/add")
    public Result add(@Valid @RequestBody CandidateForeignLanguage candidateForeignLanguage){
        return this.candidateForeignLanguageService.add(candidateForeignLanguage);
    }
}

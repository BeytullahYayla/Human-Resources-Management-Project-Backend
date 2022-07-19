package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.CandidateCvWebsiteService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.CandidateCvWebsite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/CandidateCvWebsite")
public class CandidateWebSiteController {
    CandidateCvWebsiteService candidateCvWebsiteService;
    @Autowired
    public CandidateWebSiteController(CandidateCvWebsiteService candidateCvWebsiteService) {
        this.candidateCvWebsiteService = candidateCvWebsiteService;
    }

    @GetMapping("/getAll")
    public DataResult<List<CandidateCvWebsite>> getAll(){
        return this.candidateCvWebsiteService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody CandidateCvWebsite candidateCvWebsite){
        return this.candidateCvWebsiteService.add(candidateCvWebsite);
    }



}

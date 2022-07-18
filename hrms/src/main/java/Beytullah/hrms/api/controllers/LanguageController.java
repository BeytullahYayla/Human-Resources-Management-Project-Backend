package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.ForeignLanguageService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.Language;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Languages")
public class LanguageController {
    ForeignLanguageService foreignLanguageService;
    public LanguageController(ForeignLanguageService foreignLanguageService){
        this.foreignLanguageService=foreignLanguageService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Language>> getAll(){
        return this.foreignLanguageService.listAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Language foreignLanguage){return this.foreignLanguageService.add(foreignLanguage);}
}

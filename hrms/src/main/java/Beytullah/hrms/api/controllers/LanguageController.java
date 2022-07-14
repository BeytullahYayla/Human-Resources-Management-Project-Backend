package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.ForeignLanguageService;
import Beytullah.hrms.business.concretes.ForeignLanguageManager;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.ForeignLanguage;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
@RequestMapping("/api/Languages")
public class LanguageController {
    ForeignLanguageService foreignLanguageService;
    public LanguageController(ForeignLanguageService foreignLanguageService){
        this.foreignLanguageService=foreignLanguageService;
    }

    @GetMapping("/getAll")
    public DataResult<List<ForeignLanguage>> getAll(){
        return this.foreignLanguageService.listAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody ForeignLanguage foreignLanguage){return this.foreignLanguageService.add(foreignLanguage);}
}

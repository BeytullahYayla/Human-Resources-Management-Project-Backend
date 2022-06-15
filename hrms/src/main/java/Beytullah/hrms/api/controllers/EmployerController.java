package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.EmployerService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import Beytullah.hrms.entities.concretes.Employers;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Employer")
public class EmployerController {
    private EmployerService employerService;
    public EmployerController(EmployerService employerService){
        this.employerService=employerService;
    }
    @GetMapping("/listAll")
    public DataResult<List<Employers>> listAll(){
        return this.employerService.listAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Employers employer){
        return this.employerService.add(employer);

    }
}

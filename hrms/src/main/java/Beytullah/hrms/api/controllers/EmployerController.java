package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.EmployerService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.Employer;
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
    public DataResult<List<Employer>> listAll(){
        return this.employerService.listAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Employer employer){
        return this.employerService.add(employer);

    }
    @GetMapping("/getAllByPage")
    public DataResult<List<Employer>> getAllByPage(int pageNumber, int pageSize){
        return this.employerService.getAllWithPagination(pageNumber, pageSize);
    }
}

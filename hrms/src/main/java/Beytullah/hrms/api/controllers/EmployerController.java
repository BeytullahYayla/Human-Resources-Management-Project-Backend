package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.EmployerService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.entities.concretes.Employers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

package Beytullah.hrms.api.controllers;

import java.util.List;

import Beytullah.hrms.entities.concretes.JobSeeker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Beytullah.hrms.business.abstracts.JobSeekerService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/JobSeekers")
public class JobSeekerController {
	private JobSeekerService jobSeekerService;
	
	/**
	 * @param jobSeekerService
	 */
	
	public JobSeekerController(JobSeekerService jobSeekerService) {
		
		this.jobSeekerService = jobSeekerService;
	}

	@GetMapping("/getAll")
	public DataResult<List<JobSeeker>> getAll() {
		
		return this.jobSeekerService.getAll();
		
	}
	@GetMapping("/getByNationalIdentityNumber")
	public DataResult<JobSeeker> getByNationalIdentityNumber(String nationalIdentityNumber){
		return this.jobSeekerService.getByNationalIdentityNo(nationalIdentityNumber);
	}
	@PostMapping("/add")
	public Result addSeeker(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.add(jobSeeker);
	}
	
	

}

package Beytullah.hrms.api.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Beytullah.hrms.business.abstracts.PositionService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.Position;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
@RequestMapping("/api/positions")
public class PositionController {
	
	private PositionService positionService;

	/**
	 * @param positionService
	 */
	public PositionController(PositionService positionService) {
		
		this.positionService = positionService;
	}
	
	@GetMapping("/getPositions")
	public DataResult<List<Position>> getAll(){
		
		return this.positionService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Position position) {
		return this.positionService.add(position);
	}
	

}

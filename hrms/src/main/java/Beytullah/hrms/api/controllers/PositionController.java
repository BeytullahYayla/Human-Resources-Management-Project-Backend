package Beytullah.hrms.api.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Beytullah.hrms.business.abstracts.PositionService;
import Beytullah.hrms.entities.concretes.Positions;
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
	public List<Positions> getAll(){
		
		return this.positionService.getAll();
		
	}
	

}

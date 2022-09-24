package Beytullah.hrms.business.concretes;

import java.util.List;


import Beytullah.hrms.core.utilities.results.*;
import Beytullah.hrms.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Beytullah.hrms.business.abstracts.PositionService;
import Beytullah.hrms.dataAccess.abstracts.PositionsDao;

@Service
public class PositionManager implements PositionService {

	private PositionsDao positionsDao;
	
	@Autowired
	public PositionManager(PositionsDao positionsDao) {
		this.positionsDao=positionsDao;
	}
	
	
	
	public DataResult<List<Position>> getAll() {
		
		return new SuccessDataResult<List<Position>>(this.positionsDao.findAll(),"Positions Listed");
	}



	@Override
	public Result add(Position position) {
		// TODO Auto-generated method stub
		if (!checkIfPositionNameExists(position)){
			this.positionsDao.save(position);
			return new SuccessResult("Position Saved Successfully");
		}
		return new ErrorResult("Something went wrong!! Position Name already exists");





	}


	private boolean checkIfPositionNameExists(Position position){
		if (positionsDao.findByPositionName(position.getJobTitle())!=null) {
			return true;


		}
		else{
			return false;
		}

	}



	

}

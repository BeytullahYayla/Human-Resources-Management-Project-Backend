package Beytullah.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Beytullah.hrms.business.abstracts.PositionService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import Beytullah.hrms.dataAccess.abstracts.PositionsDao;
import Beytullah.hrms.entities.concretes.Positions;
import Beytullah.hrms.*;

@Service
public class PositionManager implements PositionService {

	private PositionsDao positionsDao;
	
	@Autowired
	public PositionManager(PositionsDao positionsDao) {
		this.positionsDao=positionsDao;
	}
	
	
	
	public DataResult<List<Positions>> getAll() {
		
		return new SuccessDataResult<List<Positions>>(this.positionsDao.findAll(),"Positions Listed");
	}



	@Override
	public Result add(Positions position) {
		// TODO Auto-generated method stub
		this.positionsDao.save(position);
		return new SuccessResult("Position Saved Successfully");
	}


	private boolean checkPositionNameExists(Positions position){

	}



	

}

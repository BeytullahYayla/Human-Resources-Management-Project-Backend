package Beytullah.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Beytullah.hrms.business.abstracts.PositionService;
import Beytullah.hrms.dataAccess.abstracts.PositionsDao;
import Beytullah.hrms.entities.concretes.Positions;

@Service
public class PositionManager implements PositionService {

	private PositionsDao positionsDao;
	
	@Autowired
	public PositionManager(PositionsDao positionsDao) {
		this.positionsDao=positionsDao;
	}
	
	
	
	public List<Positions> getAll() {
		
		return this.positionsDao.findAll();
	}

}

package Beytullah.hrms.business.abstracts;

import java.util.List;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.Position;

public interface PositionService {
	
	DataResult<List<Position>> getAll();
	Result add(Position position);
	

}

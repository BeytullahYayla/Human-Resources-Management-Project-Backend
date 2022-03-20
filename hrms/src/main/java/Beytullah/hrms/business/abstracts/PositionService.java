package Beytullah.hrms.business.abstracts;

import java.util.List;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.Positions;

public interface PositionService {
	
	DataResult<List<Positions>> getAll();
	Result add(Positions position);

}

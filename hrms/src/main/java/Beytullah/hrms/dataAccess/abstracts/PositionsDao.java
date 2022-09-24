package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionsDao extends JpaRepository<Position,Integer> {//JpaRepository includes CRUD operations and more

	Position findByPositionName(String positionName);
}

package Beytullah.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Beytullah.hrms.entities.concretes.Position;

public interface PositionsDao extends JpaRepository<Position,Integer> {//JpaRepository includes CRUD operations and more

	Position findByPositionName(String positionName);
}

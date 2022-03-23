package Beytullah.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Beytullah.hrms.entities.concretes.Positions;

public interface PositionsDao extends JpaRepository<Positions,Integer> {//JpaRepository includes CRUD operations and more 

	
}

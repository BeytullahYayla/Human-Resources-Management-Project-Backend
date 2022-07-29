package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.Website;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebsiteDao extends JpaRepository<Website,Integer> {

}

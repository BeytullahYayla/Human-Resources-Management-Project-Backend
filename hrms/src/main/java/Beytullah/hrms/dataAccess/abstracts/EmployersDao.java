package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.Employers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployersDao extends JpaRepository<Employers,Integer> {
    Employers findByEmail(String email);

}

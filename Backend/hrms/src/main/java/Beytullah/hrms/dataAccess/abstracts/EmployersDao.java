package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployersDao extends JpaRepository<Employer,Integer> {
    Employer findByEmail(String email);




}

package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.Employers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployersDao extends JpaRepository<Employers,Integer> {
    Employers findByEmail(String email);



}

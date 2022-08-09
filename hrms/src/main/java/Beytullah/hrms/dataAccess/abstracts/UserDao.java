package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}

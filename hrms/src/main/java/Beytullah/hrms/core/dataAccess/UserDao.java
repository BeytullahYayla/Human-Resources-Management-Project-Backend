package Beytullah.hrms.core.dataAccess;

import Beytullah.hrms.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

}

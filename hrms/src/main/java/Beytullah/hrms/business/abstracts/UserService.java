package Beytullah.hrms.business.abstracts;


import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.User;

public interface UserService {
    Result add(User user);

}

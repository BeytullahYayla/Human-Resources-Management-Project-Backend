package Beytullah.hrms.business.abstracts;


import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {
    Result add(User user);

}

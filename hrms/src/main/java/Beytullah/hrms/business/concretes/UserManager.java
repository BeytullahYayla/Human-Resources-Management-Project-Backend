package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.UserService;
import Beytullah.hrms.core.dataAccess.UserDao;
import Beytullah.hrms.core.entities.User;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessDataResult;
import Beytullah.hrms.core.utilities.results.SuccessResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    private UserDao userDao;
    public UserManager(UserDao userDao) {
        this.userDao=userDao;
    }



    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("User added successfully");
    }

    @Override
    public DataResult<List<User>> listAll() {

        return new  SuccessDataResult<List<User>>(this.userDao.findAll(),"Users listed successfully");
    }
}

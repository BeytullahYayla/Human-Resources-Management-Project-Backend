package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.UserService;
import Beytullah.hrms.core.entities.User;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Users")
public class UserController {
    UserService userService;
    public UserController(UserService userService){
        this.userService=userService;

    }

    @GetMapping("/getAll")
    public DataResult<List<User>> listAll(){
        return this.userService.listAll();
    }
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody User user){
        return ResponseEntity.ok(this.userService.add(user));
    }

}

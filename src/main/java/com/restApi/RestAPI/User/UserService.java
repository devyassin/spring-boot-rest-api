package com.restApi.RestAPI.User;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserService {

    @Autowired
    private UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return userDaoService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getOneUser(@PathVariable int id){
        User user=userDaoService.findOneUser(id);
        if(user==null)
            throw new UserNotFoundException("id:"+id);
        return userDaoService.findOneUser(id);
    }


    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user){

         return userDaoService.addUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteOneUser(@PathVariable int id){
        User user=userDaoService.findOneUser(id);
        if(user==null){
            throw new UserNotFoundException("id:"+id);
        }else{
         userDaoService.deleteUser(id);
        }

    }


}

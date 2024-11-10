package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
@RequiredArgsConstructor
public class User_Controller {

    private final UserService service;

    @PostMapping("/add-user")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }

    @GetMapping("/view-users")
    public List<User> getUsers(){
        return service.getUsers();
    }

    @PutMapping("/update-user")
    public void updateUser(@RequestBody User user){
        service.updateUser(user);
    }

    @DeleteMapping("/delete-user/{id}")
    public void deleteUserById(@PathVariable Integer id){
        service.deleteUserById(id);
    }

    @GetMapping("/search-by-id/{id}")
    public User searchUserById(@PathVariable Integer id){
        return service.searchUserById(id);
    }
}

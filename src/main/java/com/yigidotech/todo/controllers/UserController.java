package com.yigidotech.todo.controllers;

import com.yigidotech.todo.dtos.UserDto;
import com.yigidotech.todo.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping("user")
    public UserDto createUser(@RequestBody UserDto userdto) {
        userdto = this.userService.createUser(userdto);
        return userdto;
    }

    @GetMapping("all-user")
    public List<UserDto> getAllUsers(){
        return this.userService.getAllUser();
    }
}

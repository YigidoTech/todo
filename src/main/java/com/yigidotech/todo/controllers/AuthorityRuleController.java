package com.yigidotech.todo.controllers;

import com.yigidotech.todo.dtos.AuthorityRuleDto;
import com.yigidotech.todo.dtos.UserDto;
import com.yigidotech.todo.services.AuthorityRuleService;
import com.yigidotech.todo.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("authority-rule")
public class AuthorityRuleController {

    private AuthorityRuleService authorityRuleService;

    public AuthorityRuleController(AuthorityRuleService authorityRuleService){
        this.authorityRuleService = authorityRuleService;
    }
    @PostMapping("authority-rule")
    public AuthorityRuleDto createAuthorityRule(@RequestBody AuthorityRuleDto authorityRuleDto) {
        authorityRuleDto = this.authorityRuleService.createAuthorityRule(authorityRuleDto);
        return authorityRuleDto;
    }

//    @GetMapping("all-user")
//    public List<UserDto> getAllUsers(){
//        return this.userService.getAllUser();
//    }
}

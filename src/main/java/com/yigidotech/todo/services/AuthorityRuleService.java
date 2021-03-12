package com.yigidotech.todo.services;

import com.yigidotech.todo.dtos.AuthorityRuleDto;
import com.yigidotech.todo.dtos.UserDto;
import com.yigidotech.todo.mappers.UserMapper;
import com.yigidotech.todo.models.AuthorityRule;
import com.yigidotech.todo.models.User;
import com.yigidotech.todo.repositories.AuthorityRuleRepository;
import com.yigidotech.todo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityRuleService {
    @Autowired
    private AuthorityRuleRepository authorityRuleRepository;
//    @Autowired
    private UserMapper userMapper;

//    @Transactional
    public AuthorityRuleDto createAuthorityRule(AuthorityRuleDto authorityRuleDto) {
        try {
//            User user = userMapper.toUser(userDto);
            AuthorityRule authorityRule = new AuthorityRule();
            authorityRule.setRuleName(authorityRuleDto.getRuleName());
            authorityRule = this.authorityRuleRepository.save(authorityRule);
//            userDto = userMapper.toUserDto(user);
        } catch (Exception ex) {

        }
        return authorityRuleDto;
    }
}

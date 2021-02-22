package com.yigidotech.todo.services;

import com.yigidotech.todo.dtos.UserDto;
import com.yigidotech.todo.mappers.UserMapper;
import com.yigidotech.todo.models.User;
import com.yigidotech.todo.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;

//    @Transactional
    public UserDto createUser(UserDto userDto) {
        try {
            User user = userMapper.toUser(userDto);
            user = this.userRepository.save(user);
            userDto = userMapper.toUserDto(user);
        } catch (Exception ex) {

        }
        return userDto;
    }

    public List<UserDto> getAllUser() {
        return userRepository.findAll().stream().map(userMapper::toUserDto).collect(Collectors.toList());
    }
}

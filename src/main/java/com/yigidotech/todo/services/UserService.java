package com.yigidotech.todo.services;

import com.yigidotech.todo.dtos.UserDto;
import com.yigidotech.todo.mappers.UserMapper;
import com.yigidotech.todo.models.User;
import com.yigidotech.todo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
//    @Autowired
    private UserMapper userMapper;

//    @Transactional
    public UserDto createUser(UserDto userDto) {
        try {
//            User user = userMapper.toUser(userDto);
            User user = new User();
            user.setFirstName("Hakan");
            user.setLastName("Korkmaz");
            user.setUserName("hakan.korkmaz");
            user.setPassword("123");
            user = this.userRepository.save(user);
//            userDto = userMapper.toUserDto(user);
        } catch (Exception ex) {

        }
        return userDto;
    }

    public List<UserDto> getAllUser() {
        return null;//userRepository.findAll().stream().map(userMapper::toUserDto).collect(Collectors.toList());
    }
}

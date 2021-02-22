package com.yigidotech.todo.mappers;

import com.yigidotech.todo.dtos.UserDto;
import com.yigidotech.todo.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import javax.persistence.MappedSuperclass;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    @Mapping(target = "userName", ignore = true)
    @Mapping(target = "password", ignore = true)
    public UserDto toUserDto(User user);

    public User toUser(UserDto userDto);
}

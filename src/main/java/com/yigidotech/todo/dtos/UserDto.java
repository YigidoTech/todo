package com.yigidotech.todo.dtos;

import lombok.Data;

@Data
public class UserDto {

    public Long id;
    public String firstName;
    public String lastName;
    public String userName;
    public String password;
}

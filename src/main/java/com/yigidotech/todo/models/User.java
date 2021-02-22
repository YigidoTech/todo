package com.yigidotech.todo.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public Long id;
    @Column
    public String firstName;
    @Column
    public String lastName;
    @Column
    public String userName;
    @Column
    public String password;
    public User(){}

}

package com.yigidotech.todo.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "authority_rule")
public class AuthorityRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public Long id;
    @Column(name = "rule_name")
    public String ruleName;

}

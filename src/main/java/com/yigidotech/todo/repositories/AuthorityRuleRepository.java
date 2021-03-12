package com.yigidotech.todo.repositories;

import com.yigidotech.todo.models.AuthorityRule;
import com.yigidotech.todo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorityRuleRepository extends JpaRepository<AuthorityRule,Long> {
    AuthorityRule findByRuleName(String ruleName);
    Optional<AuthorityRule> findById(Long id);
}

package com.spring.security.spirngSecurity.repository;

import com.spring.security.spirngSecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Integer> {


    User findByUserName(String username);
}

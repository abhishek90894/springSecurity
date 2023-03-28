package com.spring.security.spirngSecurity;

import com.spring.security.spirngSecurity.entity.User;
import com.spring.security.spirngSecurity.repository.userRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpirngSecurityApplication {
       @Autowired
	   private  userRepository userRepository;
	   @PostConstruct
	public void initUsers()
	{
		List<User> user= Stream.of(new User(101,"abhishek","abhi@gmail.com","12345"),
				new User(102,"ankur","ankur@gmail.com","345678")).collect(Collectors.toList());
	     userRepository.saveAll(user);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpirngSecurityApplication.class, args);
	}

}

package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domains.User;
import com.example.demo.repository.UserRepository;

@Component
public class UserService {
	@Autowired
	public UserService(UserRepository userRepository) {
		User user = new User();
		user.setUsername("shagunbakliwal");
		userRepository.save(user);

		user = new User();
		user.setUsername("prateekdash");
		userRepository.save(user);

		user = userRepository.findByUsername("shagunbakliwal");
		List<User> list = new ArrayList<>();
		list.add(userRepository.findByUsername("prateekdash"));
		user.setUsers(list);
		userRepository.save(user);
	}
}

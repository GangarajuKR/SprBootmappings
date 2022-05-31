package com.mappings.SprBootmappings.dao;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mappings.SprBootmappings.OneToOne.User;
import com.mappings.SprBootmappings.repository.UserRepository;

@Repository
public class UserDao {
	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public User getUser(int id) {
		Optional<User> optional = userRepository.findById(id);
		return optional.get();
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User updateUser(int id, User user) {
		User user2 = getUser(id);
		if (user2 != null) {
			return userRepository.save(user);
		} else
			return null;
	}

	public boolean deleteUser(int id) {
		Optional<User> user = userRepository.findById(id);
		if (user.get() != null) {
			userRepository.delete(user.get());
			return true;
		} else
			return false;
	}

}

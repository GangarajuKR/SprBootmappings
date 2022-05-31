package com.mappings.SprBootmappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappings.SprBootmappings.ManyToMany.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

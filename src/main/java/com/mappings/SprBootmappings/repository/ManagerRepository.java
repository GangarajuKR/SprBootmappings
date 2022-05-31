package com.mappings.SprBootmappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappings.SprBootmappings.OneToMany.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Integer>{

}

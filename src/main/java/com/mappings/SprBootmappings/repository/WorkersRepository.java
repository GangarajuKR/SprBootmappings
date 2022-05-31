package com.mappings.SprBootmappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappings.SprBootmappings.ManyToMany.Workers;

public interface WorkersRepository extends JpaRepository<Workers, Integer>{

}

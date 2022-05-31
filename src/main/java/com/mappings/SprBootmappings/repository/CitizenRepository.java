package com.mappings.SprBootmappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappings.SprBootmappings.OneToOne.Citizen;

public interface CitizenRepository extends JpaRepository<Citizen, Integer>{

}

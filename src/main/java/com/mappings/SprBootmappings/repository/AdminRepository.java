package com.mappings.SprBootmappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappings.SprBootmappings.OneToOne.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}

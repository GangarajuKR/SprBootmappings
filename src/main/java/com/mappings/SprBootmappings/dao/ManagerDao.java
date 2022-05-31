package com.mappings.SprBootmappings.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mappings.SprBootmappings.OneToMany.Manager;
import com.mappings.SprBootmappings.repository.ManagerRepository;

@Repository
public class ManagerDao {

	@Autowired
	private ManagerRepository managerRepository;

	public Manager saveManager(Manager m) {

		return managerRepository.save(m);
	}

	public List<Manager> getAllManagers() {
		return managerRepository.findAll();
	}

	public Manager updateManager(int id, Manager manager) {
		Optional<Manager> manager2 = managerRepository.findById(id);
		if (manager2 != null) {
			return managerRepository.save(manager);
		} else
			return null;
	}

	public boolean deleteManager(int id) {
		Manager manager = getManagerById(id);
		if (manager != null) {
			managerRepository.delete(manager);
			return true;
		} else
			return false;
	}

	public Manager getManagerById(int id) {
		Optional<Manager> manager = managerRepository.findById(id);
		return manager.get();
		
	}

}

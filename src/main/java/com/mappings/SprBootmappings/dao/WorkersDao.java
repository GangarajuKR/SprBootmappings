package com.mappings.SprBootmappings.dao;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mappings.SprBootmappings.OneToOne.Workers;
import com.mappings.SprBootmappings.repository.WorkersRepository;

@Repository
public class WorkersDao {
	@Autowired
	private WorkersRepository workersRepository;

	public Workers saveWorkers(Workers workers) {
			return workersRepository.save(workers);
	}

	public Workers getWorkerById(int wid) {
		Optional<Workers> optional = workersRepository.findById(wid);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}

	public List<Workers> getAllWorkers() {
		return workersRepository.findAll();
	}

	public Workers updateWorkers(int id, Workers workers) {
		Workers workers2 = getWorkerById(id);
		if (workers2 != null) {
			return workersRepository.save(workers);
		} else
			return null;
	}

	public boolean deleteWorkers(int id) {
		Workers workers = getWorkerById(id);
		if (workers != null) {
			workersRepository.delete(workers);
			return true;
		} else
			return false;
	}
}

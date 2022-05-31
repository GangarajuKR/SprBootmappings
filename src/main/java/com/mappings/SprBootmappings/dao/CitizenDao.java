package com.mappings.SprBootmappings.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mappings.SprBootmappings.OneToOne.Citizen;
import com.mappings.SprBootmappings.repository.CitizenRepository;

public class CitizenDao {

	@Autowired
	CitizenRepository citizenRepository;
	
	public Citizen save(Citizen citizen) {
		return citizenRepository.save(citizen);
	}
	
	public Citizen getCitizen(int id) {
		Optional<Citizen> optional = citizenRepository.findById(id);
		return optional.get();
	}
	
	public Boolean deleteCitizen(int id) {
		Citizen citizen = getCitizen(id);
		if(citizen != null) {
		citizenRepository.delete(citizen);
		return true;
		}
		return false;
	}
	
	public Citizen updateCitizen(Citizen citizen) {
		Citizen citizen2 = getCitizen(citizen.getId());
		if(citizen2 != null) {
			return citizenRepository.save(citizen);
		}
		return null;
	}
}

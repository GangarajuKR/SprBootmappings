package com.mappings.SprBootmappings.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mappings.SprBootmappings.OneToOne.Pan;
import com.mappings.SprBootmappings.repository.PanRepository;

public class PanDao {

	@Autowired
	PanRepository panRepository;
	
	public Pan savePan(Pan pan) {
		return panRepository.save(pan);
	}
	
	public Pan getPanById(int id) {
		Optional<Pan> pan = panRepository.findById(id);
		return pan.get();
	}
	
	public Boolean deletePan(int id) {
		Pan pan = getPanById(id);
		if(pan == null) {
			return false;
		}
		panRepository.delete(pan);
		return true;
	}
	
	public Pan updatePan(Pan pan) {
		Pan pan2 = getPanById(pan.getId());
		if(pan2 != null) {
			return panRepository.save(pan);
		}
		return null;
	}
}

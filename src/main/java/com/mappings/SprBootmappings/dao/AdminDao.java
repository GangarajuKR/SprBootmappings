
package com.mappings.SprBootmappings.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mappings.SprBootmappings.OneToMany.Admin;
import com.mappings.SprBootmappings.OneToMany.Manager;
import com.mappings.SprBootmappings.repository.AdminRepository;

@Repository
public class AdminDao {

	@Autowired
	private AdminRepository adminRepository;

	public Admin saveAdmin(Admin admin) {
		List<Manager> list = admin.getManagers();
		if (list != null) 
			for (Manager m : list) {
				m.setAdmin(admin);

				admin.setManagers(list);
							}
			return adminRepository.save(admin);
		
	}

	public Admin getAdmin(int id) {
		Optional<Admin> optional = adminRepository.findById(id);
		if (optional == null) {
			return null;
		} else
			return optional.get();
	}

	public Admin updateAdmin(int id, Admin admin) {
		Admin admin2 = getAdmin(id);
		if (admin2 != null) {
			adminRepository.save(admin);
			return admin;
		} else
			return null;
	}

	public boolean deleteAdmin(int id) {
		Admin admin = getAdmin(id);
		if (admin != null) {
			adminRepository.delete(admin);
			return true;
		} else
			return false;
	}

}

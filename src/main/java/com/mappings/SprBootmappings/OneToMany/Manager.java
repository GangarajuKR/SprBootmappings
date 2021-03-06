package com.mappings.SprBootmappings.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Manager {
	@Id
	private String id;
	private String name;
	private String email;
	private String password;
	private long phonenum;

	@ManyToOne
	@JoinColumn
	private Admin admin;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(long phonenum) {
		this.phonenum = phonenum;
	}

	public Admin getAdmin() {
		return admin;
	}

	@JsonIgnore
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}

package com.mappings.SprBootmappings.OneToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class User {
	@Id
	private int id;
	private String name;
	private String email;
	private long phonenum;
	private double cost;

	@ManyToMany(mappedBy = "users")
	private List<Workers> workers;

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public long getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(long phonenum) {
		this.phonenum = phonenum;
	}

	public List<Workers> getWorkers() {
		return workers;
	}

	public void setWorkers(List<Workers> workers) {
		this.workers = workers;
	}

}

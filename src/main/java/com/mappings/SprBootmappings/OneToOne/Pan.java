package com.mappings.SprBootmappings.OneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pan{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String panNo;
	
	@OneToOne(mappedBy = "pan")
	private Citizen citizens;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public Citizen getCitizens() {
		return citizens;
	}

	public void setCitizens(Citizen citizens) {
		this.citizens = citizens;
	}
	
	
	
}

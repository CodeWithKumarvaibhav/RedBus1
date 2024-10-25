package com.redbus.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passanger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int pId;
	private String name;
	private String emial;
	private int moNo;
	private char gender;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	public int getMoNo() {
		return moNo;
	}
	public void setMoNo(int moNo) {
		this.moNo = moNo;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	

}

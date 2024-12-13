package com.example.Simple.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserInfo {
	@Id
	private int userId;
	private String name;
	private int age;
	private String address;

	public UserInfo() {}
	
	public UserInfo(int userId, String name, int age, String address) {
		this(name, age, address);
		this.userId = userId;
	}

	public UserInfo(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}

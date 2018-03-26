package com.arxman.demo.sqlite.entities;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer id;
	
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private String mobile;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	@Override
	public boolean equals(Object obj){
		if (this == obj){
			return true;
		}
		User person = (User) obj;
		if (firstName != null ?
				!firstName.equals(person.firstName)
				:person.firstName != null){
			return false;
		}
		else {
			return true;
		}	
	}

	@Override
	public String toString() {
		return "User "+this.firstName+" "+this.lastName;
	}

}
package com.bean;

import javax.persistence.*;

@Entity
@Table(name = "Login")
public class Login {
	@Id
	private String emailid;
	private String password;
	private String role;
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Login [emailid=" + emailid + ", password=" + password + ", role=" + role + "]";
	}
	
	

}

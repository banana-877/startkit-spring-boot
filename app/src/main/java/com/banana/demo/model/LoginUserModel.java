package com.banana.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ログインユーザのユーザ名、パスワードを格納するためのEntity
 * @author maeda@banana
 *
 */
@Entity
@Table(name = "user")
public class LoginUserModel {
	
	@Column(name = "user_id")
	@Id
	private Integer userId;
	
	@Column(name = "username")
	private String userName;

	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
	
	public LoginUserModel(Integer userId, String userName, String email, String password) {
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	

}
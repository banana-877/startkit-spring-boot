package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ログインユーザのユーザ名、パスワードを格納するためのEntity
 * @author aoi
 *
 */
@Entity
@Table(name = "user")
public class LoginUser {
	
	@Column(name = "user_id")
	@Id
	private Integer userId;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "password")
	private String password;

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
	
	public LoginUser(Integer userId, String userName, String password) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	

}
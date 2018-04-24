package com.instajet.gwt.client.module;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;

public class User extends Exception implements IsSerializable{
/**
	 * 
	 */
	private static final long serialVersionUID = -5144788695412892144L;
	private String username;
	private String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public User() {
		
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
}

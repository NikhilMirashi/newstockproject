package com.stockapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class LoginInfo {

	@Id
	@GeneratedValue(generator = "login_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "login_gen", initialValue = 1, allocationSize = 1)
	private Integer personalId;

	private String userName;
	private String password;
	private Integer userAge;

	public LoginInfo() {
		super();
	}

	public LoginInfo(String userName, String password, Integer userAge) {
		super();
		this.userName = userName;
		this.password = password;
		this.userAge = userAge;
	}

	public Integer getPersonalId() {
		return personalId;
	}

	public void setPersonalId(Integer personalId) {
		this.personalId = personalId;
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

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	@Override
	public String toString() {
		return "LoginInfo [personalId=" + personalId + ", userName=" + userName + ", userAge=" + userAge + "]";
	}

}

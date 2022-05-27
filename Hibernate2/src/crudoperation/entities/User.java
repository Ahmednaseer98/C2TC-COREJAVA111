package crudoperation.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User")

public class User implements Serializable{
	
	private static final long serialVersionUID =1L; 
	@Id
	
	
	@Column(name="UserId")
	private long userId;
	
	@Column(name="UserName")
	private String userName;
	
	@Column(name="UserType")
	private String userType;
	
	@Column(name="UserPassword")
	private String userPassword;
	
   @OneToOne(mappedBy="studentUser")
	private College college;

	public User() {
		
	}
	
	public User(long userId, String userName, String userType, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.userPassword = userPassword;
		
		
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userType=" + userType + ", userPassword="
				+ userPassword + "]";
	}
	
	
	
	
	
	


	

	

}
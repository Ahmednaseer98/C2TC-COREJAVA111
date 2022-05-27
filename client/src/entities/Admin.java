package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import crudoperation.entities.College;



@Entity
@Table(name="Admin")

public class Admin implements Serializable{
	
	private static final long serialVersionUID =1L; 
	
	@Id
	
	@Column(name="AdminID")
	private long  adminId;
	
	@Column(name="AdminNAME")
	private String adminName;
	
	@Column(name="AdminPASSWORD")
	private String adminPassword;
	
	@OneToOne(mappedBy="studentAdmin")
	private College college;

	
	public Admin() {
		
	}
	
	public Admin(long adminId, String adminName, String adminPassword) {
		
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
	}
	
	

}
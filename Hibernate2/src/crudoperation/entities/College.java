package crudoperation.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College implements Serializable{
	
	private static final long serialVersionUID =1L; 
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="CollegeId")
	private long collegeId;
	
	@Column(name = "collegeName")
	private String collegeName;
	
	@Column(name = "collegelocation")
	private String location;
	
	@OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name ="User_Id")
	private User studentUser;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="Admin_ID")
	private Admin studentAdmin;
	
	@OneToMany(mappedBy="college")
	private Set<Student> student;
	
	@OneToMany(mappedBy="college")
	private Set<Placement> placement;
	
	@OneToMany(mappedBy="college")
	private Set<Certificate> certificate;
	
	public College() {
		
	}

	public College(long collegeId, String collegeName, String location, User studentUser, Admin studentAdmin) {
		
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.location = location;
		this.studentUser = studentUser;
		this.studentAdmin = studentAdmin;
	}

	public long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	

	public User getUser() {
		return studentUser;
	}

	public void setUser(User studentUser) {
		this.studentUser = studentUser;
	}

	public Admin getAdmin() {
		return studentAdmin;
	}

	public void setAdmin(Admin studentAdmin) {
		this.studentAdmin = studentAdmin;
	}
	
	

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	
	

	public Set<Placement> getPlacement() {
		return placement;
	}

	public void setPlacement(Set<Placement> placement) {
		this.placement = placement;
	}

	public Set<Certificate> getCertificate() {
		return certificate;
	}

	public void setCertificate(Set<Certificate> certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", location=" + location + "]";
	}
	
	
	
	
	

}
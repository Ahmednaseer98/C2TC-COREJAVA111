package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Certificate")
public class Certificate implements Serializable{
	
	
	private static final long serialVersionUID =1L;  
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="studentID")
	private int studentid;
	
	@Column(name="passingYear")
	private int passingyear;
	
	@Column(name="studentCollege")
	private String college;
	
	@OneToOne(mappedBy="studentCertificate")
	private Student student;
	
	
	public Certificate() {
		
	}

	
	

	public Certificate(int studentid, int passingyear, String college) {
		super();
		this.studentid = studentid;
		this.passingyear = passingyear;
		this.college = college;
	}




	public int getStudentid() {
		return studentid;
	}




	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}




	public int getPassingyear() {
		return passingyear;
	}




	public void setPassingyear(int passingyear) {
		this.passingyear = passingyear;
	}




	public String getCollege() {
		return college;
	}




	public void setCollege(String college) {
		this.college = college;
	}




	@Override
	public String toString() {
		return "Certificate [studentid=" + studentid + ", passingyear=" + passingyear + ", college=" + college + "]";
	}




	
	

}
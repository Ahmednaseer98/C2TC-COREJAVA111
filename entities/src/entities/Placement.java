package crudoperation.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Placement")

public class Placement implements Serializable{
	
	private static final long serialVersionUID =1L; 
	@Id
	
	@Column(name="placementId")
	private long placementId;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Qualification")
	private String Qualification;
	
	@Column(name="Year")
	private int Year;
	
	@Column(name="date")
	private LocalDate date;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="College_Id")
	private College college;
	
	
	public Placement() {
		
	}

	public Placement(long placementId, String name, String qualification, int year, LocalDate date) {
	
		this.placementId = placementId;
		Name = name;
		Qualification = qualification;
		Year = year;
		this.date = date;
	}

	public long getPlacementId() {
		return placementId;
	}

	public void setPlacementId(long placementId) {
		this.placementId = placementId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Placement [placementId=" + placementId + ", Name=" + Name + ", Qualification=" + Qualification
				+ ", Year=" + Year + ", date=" + date + "]";
	}
	
	

}
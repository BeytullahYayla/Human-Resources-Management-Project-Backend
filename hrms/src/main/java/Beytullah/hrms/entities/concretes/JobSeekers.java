package Beytullah.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="jobSeekers")
public class JobSeekers {
	

	@Id
	@GeneratedValue
	@Column(name="JobSeekerId")
	private int jobSeekerId;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="NationalIdentityNo")
	private String nationalIdentityNo;
	
	@Column(name="YearOfBirth")
	private String yearOfBirth;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Surname")
	private String surname;
	
	/**
	 * @param jobSeekerId
	 * @param name
	 * @param nationalIdentityNo
	 * @param yearOfBirth
	 * @param email
	 * @param surname
	 */
	public JobSeekers(int jobSeekerId, String name, String nationalIdentityNo, String yearOfBirth, String email,
			String surname) {
		super();
		this.jobSeekerId = jobSeekerId;
		this.name = name;
		this.nationalIdentityNo = nationalIdentityNo;
		this.yearOfBirth = yearOfBirth;
		this.email = email;
		this.surname = surname;
	}
	public JobSeekers() {
		
	}
	public int getJobSeekerId() {
		return jobSeekerId;
	}
	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationalIdentityNo() {
		return nationalIdentityNo;
	}
	public void setNationalIdentityNo(String nationalIdentityNo) {
		this.nationalIdentityNo = nationalIdentityNo;
	}
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	

	
	
	

	

}

package Beytullah.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Table(name="job_seekers")
@Entity

public class JobSeekers {
	

	@Id
	@GeneratedValue
	@Column(name="job_seeker_id")
	private int Id;
	
	@Column(name="email")
	private String email;

	
	@Column(name="name")
	private String name;
	
	@Column(name="national_identity_no")
	private String nationalIdentityNo;
	
	@Column(name="surname")
	private String surname;
	
	
	
	@Column(name="year_of_birth")
	private int yearOfBirth;
	
		
	
	
	/**
	 * @param jobSeekerId
	 * @param name
	 * @param nationalIdentityNo
	 * @param yearOfBirth
	 * @param email
	 * @param surname
	 */
	public JobSeekers(int jobSeekerId, String name,String surname ,String nationalIdentityNo, int yearOfBirth, String email) {
		super();
		this.Id = jobSeekerId;
		this.surname = surname;
		this.name = name;
		this.nationalIdentityNo = nationalIdentityNo;
		this.yearOfBirth = yearOfBirth;
		this.email = email;
		
	}
	public JobSeekers() {
		
	}
	public int getJobSeekerId() {
		return Id;
	}
	public void setJobSeekerId(int jobSeekerId) {
		this.Id = jobSeekerId;
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
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
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

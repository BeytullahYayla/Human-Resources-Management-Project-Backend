package Beytullah.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="user_id", referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","jobPostings"})

public class Employer extends User{
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_site")
	private String webSiteAdrress;
	
	@Column(name="tel_no")
	private int telNo;
	
	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobPostings;
}

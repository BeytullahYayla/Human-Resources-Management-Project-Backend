package Beytullah.hrms.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_postings")
@AllArgsConstructor
@NoArgsConstructor

public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="job_posting_id")
	private int jobPostingId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="open_position")
	private int openPositions;
	
	@Column(name="deadline")
	private LocalDateTime deadline;
	
	@Column(name="max_salary")
	private double maxSalary;
	
	@Column(name="min_salary")
	private double minSalary;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
    @ManyToOne()
    @JoinColumn(name = "city_id")
	private City city;
    
	@ManyToOne()
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;
}

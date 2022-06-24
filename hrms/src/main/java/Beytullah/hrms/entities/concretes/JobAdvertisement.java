package Beytullah.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "jobAdvertisement")
public class JobAdvertisement {

    @Id
    @GeneratedValue
    @Column(name = "job_advertisement_id")
    private int jobAdvertisementId;


    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;



    @Column(name = "job_description")
    private String jobDescription;



    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;




    @Column(name = "salary")
    private double salary;



    @Column(name="required_position_count")
    private int requiredPositionCount;

    public int getJobAdvertisementId() {
        return jobAdvertisementId;
    }

    public void setJobAdvertisementId(int jobAdvertisementId) {
        this.jobAdvertisementId = jobAdvertisementId;
    }



    public int getRequiredPositionCount() {
        return requiredPositionCount;
    }

    public void setRequiredPositionCount(int requiredPositionCount) {
        this.requiredPositionCount = requiredPositionCount;
    }
    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

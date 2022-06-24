package Beytullah.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "jobAdvertisement")
public class JobAdvertisement {

    @Id
    @GeneratedValue
    @Column(name = "job_advertisement_id")
    private int jobAdvertisementId;


    @Column(name = "employer_id")
    private int employerId;


    @Column(name = "job_description")
    private String jobDescription;



    @Column(name = "position_id")
    private int positionId;




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

    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }
    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
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

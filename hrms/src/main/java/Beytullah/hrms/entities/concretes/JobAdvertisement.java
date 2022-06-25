package Beytullah.hrms.entities.concretes;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "job_advertisement")
public class JobAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "job_advertisement_id")
    private int jobAdvertisementId;


    @ManyToOne
    @NotNull
    @JoinColumn(name = "employer_id")
    private Employer employer;



    @Column(name = "job_description")
    @NotNull
    private String jobDescription;



    @ManyToOne
    @NotNull
    @JoinColumn(name = "position_id")
    private Position position;




    @Column(name = "min_salary")
    @NotNull
    private double minSalary;

    @Column(name = "max_salary")
    @NotNull
    private double maxSalary;

    @Column(name="required_position_count")
    @NotNull
    private int requiredPositionCount;



    @Column(name="created_at")
    @NotNull
    private Date createdAt;




    @Column(name="application_deadline")
    @NotNull
    private Date applicationDeadline;

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
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

    public Date getApplicationDeadline() {
        return applicationDeadline;
    }

    public void setApplicationDeadline(Date applicationDeadline) {
        this.applicationDeadline = applicationDeadline;
    }
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

}

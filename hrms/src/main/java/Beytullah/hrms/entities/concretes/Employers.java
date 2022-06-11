package Beytullah.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "employers")
public class Employers {
    @Id
    @GeneratedValue
    @Column(name="employer_id")
    private int employerId;


    @Column(name="company_name")
    private String companyName;


    @Column(name = "web_site_url")
    private String websiteUrl;


    @Column(name = "email")
    private String email;


    @Column(name = "tel_no")
    private String telNo;


    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "password")
    private String password;



}

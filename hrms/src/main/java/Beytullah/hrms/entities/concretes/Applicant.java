package Beytullah.hrms.entities.concretes;

import Beytullah.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "applicant")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "applicant_id")
    private int applicantId;

    @OneToOne(mappedBy = "applicant")
    private User user;










}

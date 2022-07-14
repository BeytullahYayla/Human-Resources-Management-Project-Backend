package Beytullah.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate_websites")
public class CandidateWebSite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_website_id")
    private int candidateWebsiteId;

    @Column(name = "candidate_github_url")
    private String candidateGithubUrl;

    @Column(name = "candidate_linkedin_url")
    private String  candidateLinkedinUrl;
}

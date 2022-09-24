package Beytullah.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CurriculumVitae {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)


	@Column(name="cv_id")
	private int cvId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

	@Column(name="covver_letter")
	private String coverLetter;
	
    @OneToOne(mappedBy = "curriculumVitae")
    private SocialMedia socialMedia;
    
    @OneToMany(mappedBy = "curriculumVitae")
    private List<Experience> experience;
    
    @OneToMany(mappedBy = "curriculumVitae")
    private List<Education> education;
    
    @OneToMany(mappedBy = "curriculumVitae")
    private List<Language> language;
    
    @OneToOne(mappedBy = "curriculumVitae")
    private Image image;
    
    @OneToMany(mappedBy = "curriculumVitae")
    private List<Skill> skill;
}

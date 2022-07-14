package Beytullah.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate_foreign_languages")
public class CandidateForeignLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_foreign_lang_id")
    private int candidateForeignLangId;

    @Column(name = "candidate_foreign_lang_name")
    private String candidateForeignLanguageName;

    @Column(name = "level")
    private int level;

    @ManyToMany
    @JoinTable(name = "foreign_languages",
            joinColumns = @JoinColumn(name = "candidate_foreign_lang_id"),
            inverseJoinColumns = @JoinColumn(name = "candidate_cv_id"))
    List<CandidateForeignLanguage> foreignLanguages;





}

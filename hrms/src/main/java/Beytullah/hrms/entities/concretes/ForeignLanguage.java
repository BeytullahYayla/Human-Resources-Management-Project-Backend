package Beytullah.hrms.entities.concretes;

import Beytullah.hrms.business.concretes.ForeignLanguageManager;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "foreign_languages")
public class ForeignLanguage {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foreign_language_id")
    private int foreignLanguageId;
    public int getForeignLanguageId() {
        return foreignLanguageId;
    }

    public void setForeignLanguageId(int foreignLanguageId) {
        this.foreignLanguageId = foreignLanguageId;
    }



    @Column(name = "foreign_language_name")
    private String foreignLanguageName;

    public String getForeignLanguageName() {
        return foreignLanguageName;
    }

    public void setForeignLanguageName(String foreignLanguageName) {
        this.foreignLanguageName = foreignLanguageName;
    }

    @OneToMany(mappedBy = "foreignLanguage")
    List<CandidateForeignLanguage> foreignLanguages;
    public ForeignLanguage(int foreignLanguageId,String foreignLanguageName){
        super();
        this.foreignLanguageId=foreignLanguageId;
        this.foreignLanguageName=foreignLanguageName;

    }
    public ForeignLanguage(){}

}

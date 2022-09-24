package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateForeignLanguageDao extends JpaRepository<Language,Integer> {

}

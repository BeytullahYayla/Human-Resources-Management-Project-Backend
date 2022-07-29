package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.CandidateForeignLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateForeignLanguageDao extends JpaRepository<CandidateForeignLanguage,Integer> {

}

package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForeignLanguageDao extends JpaRepository<Language,Integer> {
}

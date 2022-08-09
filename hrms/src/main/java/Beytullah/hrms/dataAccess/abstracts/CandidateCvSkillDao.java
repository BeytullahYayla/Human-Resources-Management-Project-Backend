package Beytullah.hrms.dataAccess.abstracts;


import Beytullah.hrms.entities.concretes.Talent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateCvSkillDao extends JpaRepository<Talent,Integer> {
}

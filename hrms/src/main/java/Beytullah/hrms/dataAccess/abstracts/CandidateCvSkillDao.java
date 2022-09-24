package Beytullah.hrms.dataAccess.abstracts;


import Beytullah.hrms.entities.concretes.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateCvSkillDao extends JpaRepository<Skill,Integer> {
}

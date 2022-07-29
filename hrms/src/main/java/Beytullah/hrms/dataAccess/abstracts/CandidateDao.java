package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {
    Candidate getByNationalIdentity(String nationalIdentity);
    Candidate getByEmail(String email);
    boolean existsCandidateByNationalIdentity(String nationalIdentity);
    boolean existsCandidateByEmail(String email);
}

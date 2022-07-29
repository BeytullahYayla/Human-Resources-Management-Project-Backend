package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.CandidateCvImage;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CandidateImagesService {
    DataResult<List<CandidateCvImage>> getAll();
    DataResult<CandidateCvImage> getById(int id);
    Result add(MultipartFile multipartFile, int candidateId);
    Result update(MultipartFile multipartFile, int candidateId);
    Result delete(CandidateCvImage candidateCvImage);
    DataResult<List<CandidateCvImage>> getByCandidateCvId(int candidateCvId);
}

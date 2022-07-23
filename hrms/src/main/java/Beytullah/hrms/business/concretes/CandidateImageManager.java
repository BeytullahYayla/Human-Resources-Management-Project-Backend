package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.CandidateImagesService;
import Beytullah.hrms.business.abstracts.CandidateService;
import Beytullah.hrms.core.adapters.ImageService;
import Beytullah.hrms.core.utilities.results.*;
import Beytullah.hrms.dataAccess.abstracts.CandidateCvImageDao;
import Beytullah.hrms.entities.concretes.CandidateCvImage;
import com.cloudinary.Cloudinary;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class CandidateImageManager implements CandidateImagesService{

    private CandidateCvImageDao candidateCvImageDao;
    private ImageService imageService;
    private CandidateService candidateService;






    @Override
    public DataResult<List<CandidateCvImage>> getAll() {
        return new SuccessDataResult<List<CandidateCvImage>>(this.candidateCvImageDao.findAll());
    }

    @Override
    public DataResult<CandidateCvImage> getById(int id) {
        return new SuccessDataResult<CandidateCvImage>(this.candidateCvImageDao.findById(id).get());
    }

    @Override
    public Result add(MultipartFile multipartFile, int candidateId) {
        var result = this.imageService.upload(multipartFile);
        if (!result.isSuccess()) {
            return new ErrorResult("Image upload failed!");
        }
        var candidate = this.candidateService.getById(candidateId).getData();
        CandidateCvImage candidateCvImage = new CandidateCvImage();
        candidateCvImage.setCandidateCv(candidate.getCandidateCv());;
        candidateCvImage.setUrl(result.getData().get("url"));


        this.candidateCvImageDao.save(candidateCvImage);
        return new SuccessResult("Image added");
    }

    @Override
    public Result update(MultipartFile multipartFile, int id) {
        var result = this.imageService.upload(multipartFile);
        if (!result.isSuccess()) {
            return new ErrorResult("Image upload failed!");
        }
        var candidate = this.candidateService.getById(id).getData();
        CandidateCvImage candidateCvImage = new CandidateCvImage();
        candidateCvImage.setCandidateCv(candidate.getCandidateCv());;
        candidateCvImage.setUrl(result.getData().get("url"));


        this.candidateCvImageDao.save(candidateCvImage);
        return new SuccessResult("Image updated");
    }

    @Override
    public Result delete(CandidateCvImage candidateCvImage) {
        this.candidateCvImageDao.delete(candidateCvImage);
        return new SuccessResult("Image deleted");
    }

    @Override
    public DataResult<List<CandidateCvImage>> getByCandidateCvId(int candidateCvId) {
        return new SuccessDataResult<List<CandidateCvImage>>(this.candidateCvImageDao.getByCandidateCv_Id(candidateCvId));
    }

}
package Beytullah.hrms.business.concretes;

import Beytullah.hrms.business.abstracts.CandidateImagesService;
import Beytullah.hrms.core.adapters.ImageService;
import Beytullah.hrms.core.utilities.results.*;
import Beytullah.hrms.dataAccess.abstracts.CandidateCvImageDao;
import Beytullah.hrms.entities.concretes.CandidateCvImage;
import com.cloudinary.Cloudinary;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.util.List;

public class CandidateImageManager implements CandidateImagesService {
    private CandidateCvImageDao candidateCvImageDao;
    private ImageService imageService;
    private Cloudinary cloudinary;

    public CandidateImageManager(CandidateCvImageDao candidateCvImageDao,ImageService imageService,Cloudinary cloudinary){
        this.cloudinary=cloudinary;
        this.candidateCvImageDao=candidateCvImageDao;
        this.imageService=imageService;
    }
    @Override
    public DataResult<List<CandidateCvImage>> getAll() {
        return new SuccessDataResult<List<CandidateCvImage>>(this.candidateCvImageDao.findAll());
    }

    @Override
    public Result add(MultipartFile multipartFile, int candidateId) {
        var result=this.imageService.upload(multipartFile);
        if (!result.isSuccess()){
            return new ErrorResult("Image Uploading Failed");
        }

        return new SuccessResult("Image Uploaded!!");
    }

    @Override
    public Result update(MultipartFile multipartFile, int candidateId) {
        return null;
    }

    @Override
    public Result delete(CandidateCvImage candidateCvImage) {
        return null;
    }
}

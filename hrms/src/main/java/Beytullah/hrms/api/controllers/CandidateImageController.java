package Beytullah.hrms.api.controllers;

import Beytullah.hrms.business.abstracts.CandidateImagesService;
import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.entities.concretes.CandidateCvImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/Image")
public class CandidateImageController {
    private CandidateImagesService candidateCvImageService;

    @Autowired
    public CandidateImageController(CandidateImagesService candidateCvImageService) {
        this.candidateCvImageService = candidateCvImageService;
    }

    @GetMapping("/getall")
    public DataResult<List<CandidateCvImage>> getAll(){
        return this.candidateCvImageService.getAll();
    }

    @GetMapping("/getbyid")
    public DataResult<CandidateCvImage> getById(@RequestParam int id){
        return this.candidateCvImageService.getById(id);
    }

    @PostMapping(value = "/add")
    public Result add(@RequestPart("file") MultipartFile candidateCvImage, @RequestParam int candidateId) {
        return this.candidateCvImageService.add(candidateCvImage, candidateId);
    }

    @PostMapping(value = "/update")
    public Result update(@RequestPart("file") MultipartFile candidateCvImage, @RequestParam int candidateId) {
        return this.candidateCvImageService.update(candidateCvImage, candidateId);
    }

    @PostMapping(value = "/delete")
    public Result delete(@RequestBody CandidateCvImage candidateCvImage) {
        return this.candidateCvImageService.delete(candidateCvImage);
    }

    @GetMapping(value = "/getbycandidatecvid")
    public DataResult<List<CandidateCvImage>> getByCandidateCvId(@RequestParam int candidateCvId){
        return this.candidateCvImageService.getByCandidateCvId(candidateCvId);
    }
}

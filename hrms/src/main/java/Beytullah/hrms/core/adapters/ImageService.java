package Beytullah.hrms.core.adapters;
import java.io.IOException;
import java.util.Map;

import Beytullah.hrms.core.utilities.results.DataResult;
import org.springframework.web.multipart.MultipartFile;



public interface ImageService {
    DataResult<Map<String, String>> upload(MultipartFile multipartFile);

    @SuppressWarnings("rawtypes")
    DataResult<Map> delete(String id) throws IOException;
}

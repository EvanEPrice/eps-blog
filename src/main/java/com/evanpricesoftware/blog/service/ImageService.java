package com.evanpricesoftware.blog.service;

import com.evanpricesoftware.blog.config.AppProperties;
import com.evanpricesoftware.blog.exception.S3ObjectRetrieveException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    private AppProperties appProperties;
    private S3Service s3Service;

    @Autowired
    public ImageService(AppProperties appProperties, S3Service s3Service) {
        this.appProperties = appProperties;
        this.s3Service = s3Service;
    }

    public byte[] getImage(String imagePath) throws S3ObjectRetrieveException {
        return s3Service.getObject(appProperties.getBucketName(), imagePath);
    }

}

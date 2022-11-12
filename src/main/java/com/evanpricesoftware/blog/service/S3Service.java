package com.evanpricesoftware.blog.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.util.IOUtils;
import com.evanpricesoftware.blog.exception.S3ObjectRetrieveException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class S3Service {

    private AmazonS3 amazonS3;

    @Autowired
    public S3Service(AmazonS3 amazonS3) {
        this.amazonS3 = amazonS3;
    }

    public byte[] getObject(String bucket, String key) throws S3ObjectRetrieveException {
        try {
            return IOUtils.toByteArray(amazonS3.getObject(bucket, key).getObjectContent());
        } catch (IOException e) {
            throw new S3ObjectRetrieveException(e);
        }
    }


}

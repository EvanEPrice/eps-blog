package com.evanpricesoftware.blog.controller;

import com.evanpricesoftware.blog.exception.S3ObjectRetrieveException;
import com.evanpricesoftware.blog.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    private ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping(
            value = "images/{imagePath}",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public byte[] get(@PathVariable("imagePath") String imagePath) throws S3ObjectRetrieveException {
        return imageService.getImage(imagePath);
    }

}

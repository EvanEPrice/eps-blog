package com.evanpricesoftware.blog.controller;

import com.evanpricesoftware.blog.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    private ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("images/${imagePath}")
    public byte[] get(@RequestParam("imagePath") String imagePath){
        return imageService.getImage(imagePath);
    }

}

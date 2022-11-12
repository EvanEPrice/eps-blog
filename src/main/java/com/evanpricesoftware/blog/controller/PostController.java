package com.evanpricesoftware.blog.controller;

import com.evanpricesoftware.blog.model.Post;
import com.evanpricesoftware.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/post/{postId}")
    public Post test(@RequestParam("postId")int postId){
        return postService.get(postId);
    }

}

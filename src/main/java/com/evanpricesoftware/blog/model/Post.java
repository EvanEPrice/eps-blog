package com.evanpricesoftware.blog.model;

import lombok.Data;

@Data
public class Post {

    private long publishTimestamp;
    private String text;

}

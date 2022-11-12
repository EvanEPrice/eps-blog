package com.evanpricesoftware.blog.exception;

public class S3ObjectRetrieveException extends Exception{

    private static final String MESSAGE = "Error retrieving s3 object.";

    public S3ObjectRetrieveException(Exception e){
        super(MESSAGE, e);
    }

}

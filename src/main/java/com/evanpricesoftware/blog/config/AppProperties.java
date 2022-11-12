package com.evanpricesoftware.blog.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("eps.blog")
@Data
public class AppProperties {

    String bucketName;
}

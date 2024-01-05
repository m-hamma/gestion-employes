package com.hamma.gestionemployes.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Configuration
@ConfigurationProperties(prefix = "com.hamma.gestionemployes")
@Data
public class CustomProperties {

    private String apiUrl;

}
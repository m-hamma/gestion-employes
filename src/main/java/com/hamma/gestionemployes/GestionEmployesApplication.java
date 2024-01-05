package com.hamma.gestionemployes;

import com.hamma.gestionemployes.configuration.CustomProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import lombok.Data;

@Data
@SpringBootApplication
public class GestionEmployesApplication implements CommandLineRunner {

    @Autowired
    private CustomProperties properties;

    public static void main(String[] args) {
        SpringApplication.run(GestionEmployesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(properties.getApiUrl());
    }

}

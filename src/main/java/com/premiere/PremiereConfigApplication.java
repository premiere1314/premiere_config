package com.premiere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PremiereConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(PremiereConfigApplication.class, args);
    }

}

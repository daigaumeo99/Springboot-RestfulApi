package com.example.cruduser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.cruduser"})
public class CrudUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudUserApplication.class, args);
    }

}

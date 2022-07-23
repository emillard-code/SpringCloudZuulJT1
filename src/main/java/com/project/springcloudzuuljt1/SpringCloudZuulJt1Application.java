package com.project.springcloudzuuljt1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudZuulJt1Application {

    @GetMapping("/getDiagnosis")
    public String getDoctorService() {

        return "Diagnosis microservice called...";

    }

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudZuulJt1Application.class, args);

    }

}

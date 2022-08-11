package com.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiagnosisController {

    @GetMapping("/getDiagnosis")
    public String getDoctorService() {

        return "Diagnosis microservice called...";

    }

}

package com.example.project_leap_25cc062_vignesh.controller;

import com.example.project_leap_25cc062_vignesh.model.Student;
import com.example.project_leap_25cc062_vignesh.services.WebServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    @Autowired
    WebServices webServices;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return webServices.saveStudent(student);
    }
}
package com.example.project_leap_25cc062_vignesh.controller;

import com.example.project_leap_25cc062_vignesh.services.WebServices;
import com.example.project_leap_25cc062_vignesh.services.impl.WebServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    WebServices WebServices;
    @PostMapping("/data/write")
    String WriteData(String data){
    WebServices wb = new WebServiceImpl();
    return wb.WriteDataFromController(data);
    }

    @GetMapping("/data/get")
    String getData(){
        WebServices wb = new WebServiceImpl();
        return wb.ReadDataFromController();
    }
}

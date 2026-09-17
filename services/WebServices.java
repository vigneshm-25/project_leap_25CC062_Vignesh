package com.example.project_leap_25cc062_vignesh.services;

import org.springframework.stereotype.Service;

@Service
public interface WebServices    {
    String WriteDataFromController(String data);

    String ReadDataFromController();
}

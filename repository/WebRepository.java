package com.example.project_leap_25cc062_vignesh.repository;

import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;

@Repository
public interface WebRepository {
    String WriteDataFromController(String d);
    String ReadDataFromController();
}

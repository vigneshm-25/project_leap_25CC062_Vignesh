package com.example.project_leap_25cc062_vignesh.repository.impl;

import com.example.project_leap_25cc062_vignesh.repository.WebRepository;

import javax.xml.crypto.Data;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WebRepositoryImpl implements WebRepository {

    @Override
    public String WriteDataFromController(String data) {

            try {
                FileWriter writer = new FileWriter("data.txt");

                writer.write(data);

                writer.close();

                System.out.println("Data written successfully!");
            }
            catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());

        }
            return data;
    }
    @Override
    public String ReadDataFromController() {

        try {
            return Files.readString(Paths.get("data.txt"));
        }
        catch (IOException e) {
            return "An error occured"+e.getLocalizedMessage();
        }

    }
}

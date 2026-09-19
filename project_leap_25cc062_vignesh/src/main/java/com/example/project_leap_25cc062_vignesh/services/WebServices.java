package com.example.project_leap_25cc062_vignesh.services;

import com.example.project_leap_25cc062_vignesh.model.Student;

import java.util.List;

public interface WebServices {

    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> readStudents();
    Student updateStudent(Student student);
}

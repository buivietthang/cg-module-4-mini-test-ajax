package com.example.minitestmodule4ajax.service;

import com.example.minitestmodule4ajax.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void save(Student student);

    Student findById(Long id);

    void delete(Long id);

    List<Student> findByName(String name);
}

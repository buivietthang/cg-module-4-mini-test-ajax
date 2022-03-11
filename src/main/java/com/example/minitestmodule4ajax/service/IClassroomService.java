package com.example.minitestmodule4ajax.service;

import com.example.minitestmodule4ajax.model.Classroom;

import java.util.List;

public interface IClassroomService {
    List<Classroom> findAll();

    Classroom findById(Long id);
}

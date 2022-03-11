package com.example.minitestmodule4ajax.service;

import com.example.minitestmodule4ajax.model.Classroom;
import com.example.minitestmodule4ajax.repository.IClassroomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService implements IClassroomService {
    @Autowired
    IClassroomRepo iClassroomRepo;

    @Override
    public List<Classroom> findAll() {
        return (List<Classroom>) iClassroomRepo.findAll();
    }

    @Override
    public Classroom findById(Long id) {
        return iClassroomRepo.findById(id).get();
    }
}

package com.example.minitestmodule4ajax.service;

import com.example.minitestmodule4ajax.model.Student;
import com.example.minitestmodule4ajax.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    IStudentRepo iStudentRepo;

    @Override
    public List<Student> findAll() {
        return (List<Student>) iStudentRepo.findAll();
    }

    @Override
    public void save(Student student) {
        iStudentRepo.save(student);
    }

    @Override
    public Student findById(Long id) {
        return iStudentRepo.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        iStudentRepo.deleteById(id);
    }

    @Override
    public List<Student> findByName(String name) {
        return iStudentRepo.findAllByNameStudent(name);
    }
}

package com.example.minitestmodule4ajax.repository;

import com.example.minitestmodule4ajax.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IStudentRepo extends PagingAndSortingRepository<Student, Long> {
    List<Student> findAllByNameStudent(String name);
}

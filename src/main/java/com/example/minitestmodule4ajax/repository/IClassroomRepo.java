package com.example.minitestmodule4ajax.repository;

import com.example.minitestmodule4ajax.model.Classroom;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClassroomRepo extends PagingAndSortingRepository<Classroom, Long> {
}

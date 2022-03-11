package com.example.minitestmodule4ajax.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idStudent;
    private String nameStudent;
    private LocalDate dateOfBirth;
    private String address;
    private String phoneNumber;
    private String email;

    @ManyToOne
    private Classroom classroom;

    public Student() {
    }

    public Student(Long idStudent, String nameStudent, LocalDate dateOfBirth, String address, String phoneNumber, String email, Classroom classroom) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.classroom = classroom;
    }
}

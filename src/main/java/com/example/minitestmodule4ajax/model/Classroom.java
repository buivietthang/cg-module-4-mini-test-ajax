package com.example.minitestmodule4ajax.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClassroom;
    private String nameClassroom;

    public Classroom() {
    }

    public Classroom(Long idClassroom, String nameClassroom) {
        this.idClassroom = idClassroom;
        this.nameClassroom = nameClassroom;
    }
}

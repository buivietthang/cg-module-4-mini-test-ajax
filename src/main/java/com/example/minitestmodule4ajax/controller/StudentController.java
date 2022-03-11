package com.example.minitestmodule4ajax.controller;

import com.example.minitestmodule4ajax.model.Classroom;
import com.example.minitestmodule4ajax.model.Student;
import com.example.minitestmodule4ajax.service.IClassroomService;
import com.example.minitestmodule4ajax.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/home")
public class StudentController {
    @Autowired
    IStudentService iStudentService;

    @Autowired
    IClassroomService iClassroomService;

    @GetMapping
    public ResponseEntity<List<Student>> students() {
        return new ResponseEntity<>(iStudentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Classroom>> getListClassrooms() {
        return new ResponseEntity<>(iClassroomService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        return new ResponseEntity(iStudentService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<List<Student>> searchStudent(@PathVariable String name) {
        return new ResponseEntity(iStudentService.findByName(name), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        iStudentService.save(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Student> editStudent(@RequestBody Student student) {
        iStudentService.save(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteStudent(@PathVariable Long id) {
        iStudentService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}

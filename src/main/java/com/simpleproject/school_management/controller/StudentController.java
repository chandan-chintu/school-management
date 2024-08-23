package com.simpleproject.school_management.controller;

import com.simpleproject.school_management.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/student")
public class StudentController {

    HashMap<Integer, Student> studentHashMapDB = new HashMap<Integer, Student>();

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentHashMapDB.put(student.getStudentId(), student);
        return "Student added successfully";
    }

    @GetMapping("/getAll")
    public HashMap<Integer, Student> getAllStudents(){
        return studentHashMapDB;
    }
}

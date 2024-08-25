package com.simpleproject.school_management.controller;

import com.simpleproject.school_management.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    HashMap<Integer, Student> studentHashMapDB = new HashMap<Integer, Student>();

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        studentHashMapDB.put(student.getStudentId(), student);
        return "Student added successfully";
    }

    @GetMapping("/getAll")
    public HashMap<Integer, Student> getAllStudents() {
        return studentHashMapDB;
    }

    // @Path variable - input is sent in the url path (used generally for single input)
    @GetMapping("/getById/{studentid}")
    public Student getStudentById(@PathVariable("studentid") int studentId) {
        Student student = studentHashMapDB.get(studentId);
        return student;
    }

    // @RequestParam - it takes input in the form of request parameter
    @GetMapping("/getByNameAndGrade/{name}/{grade}")
    public Student getStudentByNameAndGrade(@RequestParam("name") String name, @RequestParam("grade") String grade){
        for (Student stu1 : studentHashMapDB.values()){
            if(stu1.getName().equals(name) && stu1.getGrade().equals(grade)){
                return stu1;
            }
        }
        return null;
    }


    @PutMapping("/update/{studentid}")
    public String updateStudentGradeAndSection(@PathVariable("studentid") int studentId, @RequestParam("grade") String grade, @RequestParam("section") String section){
        if(studentHashMapDB.containsKey(studentId)){
            Student student = studentHashMapDB.get(studentId);
            student.setGrade(grade);
            student.setSection(section);
            studentHashMapDB.put(studentId,student);
            return "Student updated successfully";
        } else{
            return "Student does not exists";
        }
    }

    @DeleteMapping("/delete/{studentid}")
    public String deleteStudentById(@PathVariable("studentid") int studentId){
        studentHashMapDB.remove(studentId);
        return "Student with id "+studentId+" deleted";
    }
}

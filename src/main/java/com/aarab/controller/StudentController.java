package com.aarab.controller;

import com.aarab.entity.Student;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class StudentController {
    @GetMapping(value="/student")
    public Student getStudent(){
        return new Student("laila","laaraj");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("laila","laaraj"));
        students.add(new Student("Ahmed","Swamer"));
        students.add(new Student("Amine","Arrouk"));
        students.add(new Student("laila","laaraj"));
        students.add(new Student("Ahmed","Swamer"));
        students.add(new Student("Amine","Arrouk"));
        return students;
    }

    @GetMapping("/student/{firstname}/{lastname}")
    public Student getStudentPathVariable(@PathVariable("firstname") String firstname,@PathVariable("lastname") String lastname){
        return new Student(firstname,lastname);
    }

    @GetMapping("/student/query")
    public Student studentQueryParam(@RequestParam(name = "firstname") String firstname,@RequestParam(name = "lastname") String lastname){
        return new Student(firstname,lastname);
    }
}

package com.crayconotas.web.controller;

import com.crayconotas.domain.Student;
import com.crayconotas.domain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAll(){
        return studentService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Student> getStudent(@PathVariable("id") int studentId){
        return studentService.getStudent(studentId);
    }
    @PostMapping("/save")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @PutMapping("/update/{id}")
    public Student update(@RequestBody Student student, @PathVariable("id") int studentId){
        return studentService.update(student, studentId);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int studentId){
        return studentService.delete(studentId);
    }
}

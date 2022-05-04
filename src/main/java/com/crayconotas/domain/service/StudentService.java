package com.crayconotas.domain.service;

import com.crayconotas.domain.Student;
import com.crayconotas.domain.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll(){
        return studentRepository.getAll();
    }
    public Optional<Student> getStudent(int studentId){
        return studentRepository.getStudent(studentId);
    }
    public Student save(Student student){
        return studentRepository.save(student);
    }
    public Student update(Student student, int studentId) {
        return studentRepository.getStudent(studentId)
                .map(student1 -> {
                    student1.setStudentId(student.getStudentId());
                    student1.setStudentName(student.getStudentName());
                    student1.setStudentLastName(student.getStudentLastName());
                    student1.setGrade(student.getGrade());
                    student1.setStudentEmail(student.getStudentEmail());
                    student1.setStudentAdress(student.getStudentAdress());
                    return studentRepository.save(student1);
                })
                .orElseGet(() -> {
                    student.setStudentId(studentId);
                    return studentRepository.save(student);
                });
    }
    public boolean delete(int studentId){
        return getStudent(studentId).map(student -> {
            studentRepository.delete(studentId);
            return true;
        }).orElse( false);
    }
}

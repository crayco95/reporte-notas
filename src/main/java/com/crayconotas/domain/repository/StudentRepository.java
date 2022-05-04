package com.crayconotas.domain.repository;

import com.crayconotas.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    List<Student> getAll();
    Optional<Student> getStudent(int studentId);
    Student save(Student student);
    void delete(int studentId);
}

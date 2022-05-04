package com.crayconotas.persistence;

import com.crayconotas.domain.Student;
import com.crayconotas.domain.repository.StudentRepository;
import com.crayconotas.persistence.crud.AlumnoCrudRepository;
import com.crayconotas.persistence.entity.Alumno;
import com.crayconotas.persistence.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//Orientación de Repositorio a términos de dominio
@Repository
public class AlumnoRepository implements StudentRepository {
    @Autowired
    private AlumnoCrudRepository alumnoCrudRepository;
    @Autowired
    private StudentMapper mapper;

    @Override
    public List<Student> getAll(){
        List<Alumno> alumnos = (List<Alumno>) alumnoCrudRepository.findAll();
        return mapper.toStudent(alumnos);
    }

    @Override
    public Optional<Student> getStudent(int studentId) {
        return alumnoCrudRepository.findById(studentId).map(alumno -> mapper.toStudent(alumno));
    }

    @Override
    public Student save(Student student) {
        Alumno alumno = mapper.toAlumno(student);
        return mapper.toStudent(alumnoCrudRepository.save(alumno));
    }

    @Override
    public void delete(int studentId){
        alumnoCrudRepository.deleteById(studentId);
    }
}

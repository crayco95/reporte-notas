package com.crayconotas.persistence.mapper;

import com.crayconotas.domain.Student;
import com.crayconotas.persistence.entity.Alumno;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
//Se indica en la anotación @Mapper que el modelo corresponde a un componente
//Spring
@Mapper(componentModel = "spring", uses = {ReportMapper.class})
public interface StudentMapper {
    @Mappings({
            @Mapping(source = "idAlumno", target = "studentId"),
            @Mapping(source = "nombreAlumno", target = "studentName"),
            @Mapping(source = "apellidoAlumno", target = "studentLastName"),
            @Mapping(source = "grado", target = "grade"),
            @Mapping(source = "correoAlumno", target = "studentEmail"),
            @Mapping(source = "direccionAlumno", target = "studentAdress")
    })
    Student toStudent(Alumno alumno);
    List<Student> toStudent(List<Alumno> alumnos);

    @InheritInverseConfiguration
    @Mapping(target = "reportes", ignore = true)
    Alumno toAlumno(Student student);
}

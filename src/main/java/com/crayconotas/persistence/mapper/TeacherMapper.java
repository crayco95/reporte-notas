package com.crayconotas.persistence.mapper;

import com.crayconotas.domain.Teacher;
import com.crayconotas.persistence.entity.Profesor;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
//Se indica en la anotación @Mapper que el modelo corresponde a un componente
//Spring
@Mapper(componentModel = "spring", uses = {ReportMapper.class})
public interface TeacherMapper {
    @Mappings({
            @Mapping(source = "idProfesor", target = "teacherId"),
            @Mapping(source = "nombreProfesor", target = "teacherName"),
            @Mapping(source = "apellidoProfesor", target = "teacherLastName"),
            @Mapping(source = "correoProfesor", target = "teacherEmail")
    })
    Teacher toTeacher(Profesor profesor);
    List<Teacher> toTeacher(List<Profesor> profesores);
    @InheritInverseConfiguration
    @Mapping(target = "reportes", ignore = true)
    Profesor toProfesor(Teacher teacher);
}

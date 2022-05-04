package com.crayconotas.persistence.mapper;

import com.crayconotas.domain.Course;
import com.crayconotas.persistence.entity.Materia;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
//Se indica en la anotación @Mapper que el modelo corresponde a un componente
//Spring
@Mapper(componentModel = "spring", uses = {ReportMapper.class})
public interface CourseMapper {
    @Mappings({
            @Mapping(source = "idMateria", target = "courseId"),
            @Mapping(source = "nombreMateria", target = "courseName")
    })
    Course toCourse(Materia materia);
    List<Course> toCourse(List<Materia> materias);
    @InheritInverseConfiguration
    @Mapping(target = "reportes", ignore = true)
    Materia toMateria(Course course);
}

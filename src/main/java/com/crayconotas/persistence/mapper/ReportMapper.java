package com.crayconotas.persistence.mapper;

import com.crayconotas.domain.Report;
import com.crayconotas.persistence.entity.Reporte;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
//Se indica en la anotación @Mapper que el modelo corresponde a un componente
//Spring
@Mapper(componentModel = "spring", uses = {StudentMapper.class, TeacherMapper.class, CourseMapper.class})
public interface ReportMapper {
    @Mappings({
            @Mapping(source = "idReporte", target = "reportId"),
            @Mapping(source = "alumno", target = "student"),
            @Mapping(source = "profesor", target = "teacher"),
            @Mapping(source = "materia", target = "course"),
            @Mapping(source = "nota", target = "note")
    })
    Report toReport(Reporte reporte);
    List<Report> toReport(List<Reporte> reportes);
    @InheritInverseConfiguration
    Reporte toReporte(Report report);
}

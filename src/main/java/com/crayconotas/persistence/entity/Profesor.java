package com.crayconotas.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor")
    private Integer idProfesor;
    @Column(name = "nombre_profesor")
    private String nombreProfesor;
    @Column(name = "apellido_profesor")
    private String apellidoProfesor;
    @Column(name = "correo_profesor")
    private String correoProfesor;
    @OneToMany(mappedBy = "profesor")
    private List<Reporte> reportes;

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellidoProfesor() {
        return apellidoProfesor;
    }

    public void setApellidoProfesor(String apellidoProfesor) {
        this.apellidoProfesor = apellidoProfesor;
    }

    public String getCorreoProfesor() {
        return correoProfesor;
    }

    public void setCorreoProfesor(String correoProfesor) {
        this.correoProfesor = correoProfesor;
    }

    public List<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(List<Reporte> reportes) {
        this.reportes = reportes;
    }
}

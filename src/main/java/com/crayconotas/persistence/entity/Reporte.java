package com.crayconotas.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "reportes")
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reporte")
    private Integer idReporte;
    @ManyToOne
    @JoinColumn(name = "id_alumno", insertable = false, updatable = false)
    private Alumno alumno;
    @ManyToOne
    @JoinColumn(name = "id_profesor", insertable = false, updatable = false)
    private Profesor profesor;
    @ManyToOne
    @JoinColumn(name = "id_materia", insertable = false, updatable = false)
    private Materia materia;
    private double nota;

    public Integer getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Integer idReporte) {
        this.idReporte = idReporte;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

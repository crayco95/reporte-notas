package com.crayconotas.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "materias")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia")
    private Integer idMateria;
    @Column(name = "nombre_materia")
    private String nombreMateria;
    @OneToMany(mappedBy = "materia")
    private List<Reporte> reportes;

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public List<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(List<Reporte> reportes) {
        this.reportes = reportes;
    }
}

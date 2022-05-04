package com.crayconotas.persistence.crud;

import com.crayconotas.persistence.entity.Reporte;
import org.springframework.data.repository.CrudRepository;

public interface ReporteCrudRepository extends CrudRepository<Reporte, Integer> {
}

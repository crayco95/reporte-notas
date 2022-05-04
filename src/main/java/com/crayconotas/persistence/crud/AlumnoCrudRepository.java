package com.crayconotas.persistence.crud;

import com.crayconotas.persistence.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoCrudRepository extends CrudRepository<Alumno, Integer> {
}

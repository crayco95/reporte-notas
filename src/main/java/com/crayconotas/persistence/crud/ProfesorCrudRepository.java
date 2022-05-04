package com.crayconotas.persistence.crud;

import com.crayconotas.persistence.entity.Profesor;
import org.springframework.data.repository.CrudRepository;

public interface ProfesorCrudRepository extends CrudRepository<Profesor, Integer> {
}

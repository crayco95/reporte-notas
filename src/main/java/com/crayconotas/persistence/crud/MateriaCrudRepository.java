package com.crayconotas.persistence.crud;

import com.crayconotas.persistence.entity.Materia;
import org.springframework.data.repository.CrudRepository;

public interface MateriaCrudRepository extends CrudRepository<Materia, Integer> {
}

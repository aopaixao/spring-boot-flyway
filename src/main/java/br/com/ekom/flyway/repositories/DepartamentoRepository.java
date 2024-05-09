package br.com.ekom.flyway.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.ekom.flyway.entities.Departamento;

public interface DepartamentoRepository extends CrudRepository<Departamento,Long> {

}
package br.com.ekom.flyway.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.ekom.flyway.entities.Empregado;

public interface EmpregadoRepository extends CrudRepository<Empregado,Long> {

}
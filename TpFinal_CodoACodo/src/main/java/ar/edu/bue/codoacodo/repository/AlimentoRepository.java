package ar.edu.bue.codoacodo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.bue.codoacodo.entity.Alimento;


@Repository
public interface AlimentoRepository extends CrudRepository<Alimento, Long>{
	
	

}

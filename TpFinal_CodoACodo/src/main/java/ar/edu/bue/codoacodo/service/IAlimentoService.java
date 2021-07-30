package ar.edu.bue.codoacodo.service;

import java.util.List;

import ar.edu.bue.codoacodo.entity.Alimento;

public interface IAlimentoService {

	public void guardar(Alimento alimento);
	
	public List<Alimento> ObtenerAlimentos();
	
	public void borrar (Long codigo);
	
	public Alimento buscarAliemnto() throws Exception;
	
	
}

package ar.edu.bue.codoacodo.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.bue.codoacodo.entity.Alimento;
import ar.edu.bue.codoacodo.repository.AlimentoRepository;
import ar.edu.bue.codoacodo.service.IAlimentoService;

@Service
public class AlimentoServiceImp implements IAlimentoService {

	@Autowired
	AlimentoRepository alimentoRepository;
	
	@Override
	public void guardar(Alimento alimento) {
		alimentoRepository.save(alimento);

	}

	@Override
	public List<Alimento> ObtenerAlimentos() {
		List<Alimento> alimentos = new ArrayList<>();
		alimentoRepository.findAll().forEach(alimentos::add);
		return alimentos;
	}

	@Override
	public void borrar(Long codigo) {
		alimentoRepository.deleteById(codigo);

	}

	@Override
	public Alimento buscarAliemnto() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

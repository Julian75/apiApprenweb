package com.apprenweb.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apprenweb.Entity.PreguntaEvaluacion;
import com.apprenweb.Repository.IPreguntaEvaluacionRepository;
import com.apprenweb.Service.IPreguntaEvaluacionService;

@Service
public class PreguntaEvaluacionServiceImplement implements IPreguntaEvaluacionService{
	
	@Autowired
	private IPreguntaEvaluacionRepository repository;
	        
	
	@Override
	public List<PreguntaEvaluacion> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<PreguntaEvaluacion> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public PreguntaEvaluacion save(PreguntaEvaluacion preguntaEvaluacion) {
		return this.repository.save(preguntaEvaluacion);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}

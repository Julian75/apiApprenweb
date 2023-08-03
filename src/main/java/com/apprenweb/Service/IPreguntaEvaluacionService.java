package com.apprenweb.Service;

import java.util.List;
import java.util.Optional;

import com.apprenweb.Entity.PreguntaEvaluacion;

public interface IPreguntaEvaluacionService {

	public List<PreguntaEvaluacion> all();
	
	public Optional<PreguntaEvaluacion> findById(Long id);
	
	public PreguntaEvaluacion save(PreguntaEvaluacion preguntaEvaluacion);
	
	public void delete(Long id);

}

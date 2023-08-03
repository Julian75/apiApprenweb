package com.apprenweb.Service;

import java.util.List;
import java.util.Optional;

import com.apprenweb.Entity.EvaluacionSeccionEstudiante;

public interface IEvaluacionSeccionEstudianteService {

	public List<EvaluacionSeccionEstudiante> all();
	
	public Optional<EvaluacionSeccionEstudiante> findById(Long id);
	
	public EvaluacionSeccionEstudiante save(EvaluacionSeccionEstudiante evaluacionSeccionEstudiante);
	
	public void delete(Long id);

}

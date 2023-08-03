package com.apprenweb.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apprenweb.Entity.EvaluacionSeccionEstudiante;
import com.apprenweb.Repository.IEvaluacionSeccionEstudianteRepository;
import com.apprenweb.Service.IEvaluacionSeccionEstudianteService;

@Service
public class EvaluacionSeccionEstudianteServiceImplement implements IEvaluacionSeccionEstudianteService{
	
	@Autowired
	private IEvaluacionSeccionEstudianteRepository repository;
	        
	
	@Override
	public List<EvaluacionSeccionEstudiante> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<EvaluacionSeccionEstudiante> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public EvaluacionSeccionEstudiante save(EvaluacionSeccionEstudiante evaluacionSeccionEstudiante) {
		return this.repository.save(evaluacionSeccionEstudiante);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}

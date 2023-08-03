package com.apprenweb.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apprenweb.Entity.CursoEstudiante;
import com.apprenweb.Repository.ICursoEstudianteRepository;
import com.apprenweb.Service.ICursoEstudianteService;

@Service
public class CursoEstudianteServiceImplement implements ICursoEstudianteService{
	
	@Autowired
	private ICursoEstudianteRepository repository;
	        
	
	@Override
	public List<CursoEstudiante> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<CursoEstudiante> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public CursoEstudiante save(CursoEstudiante cursoEstudiante) {
		return this.repository.save(cursoEstudiante);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}

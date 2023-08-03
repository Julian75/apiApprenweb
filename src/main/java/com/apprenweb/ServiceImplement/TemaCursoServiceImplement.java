package com.apprenweb.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apprenweb.Entity.TemaCurso;
import com.apprenweb.Repository.ITemaCursoRepository;
import com.apprenweb.Service.ITemaCursoService;

@Service
public class TemaCursoServiceImplement implements ITemaCursoService{
	
	@Autowired
	private ITemaCursoRepository repository;
	        
	
	@Override
	public List<TemaCurso> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<TemaCurso> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public TemaCurso save(TemaCurso temaCurso) {
		return this.repository.save(temaCurso);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}

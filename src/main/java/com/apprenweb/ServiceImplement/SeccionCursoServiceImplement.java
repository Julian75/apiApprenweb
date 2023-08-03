package com.apprenweb.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apprenweb.Entity.SeccionCurso;
import com.apprenweb.Repository.ISeccionCursoRepository;
import com.apprenweb.Service.ISeccionCursoService;

@Service
public class SeccionCursoServiceImplement implements ISeccionCursoService{
	
	@Autowired
	private ISeccionCursoRepository repository;
	        
	
	@Override
	public List<SeccionCurso> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<SeccionCurso> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public SeccionCurso save(SeccionCurso seccionCurso) {
		return this.repository.save(seccionCurso);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}

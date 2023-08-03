package com.apprenweb.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apprenweb.Entity.Curso;
import com.apprenweb.Repository.ICursoRepository;
import com.apprenweb.Service.ICursoService;

@Service
public class CursoServiceImplement implements ICursoService{
	
	@Autowired
	private ICursoRepository repository;
	        
	
	@Override
	public List<Curso> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<Curso> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public Curso save(Curso curso) {
		return this.repository.save(curso);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}

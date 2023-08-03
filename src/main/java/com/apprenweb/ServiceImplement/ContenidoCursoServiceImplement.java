package com.apprenweb.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apprenweb.Entity.ContenidoCurso;
import com.apprenweb.Repository.IContenidoCursoRepository;
import com.apprenweb.Service.IContenidoCursoService;

@Service
public class ContenidoCursoServiceImplement implements IContenidoCursoService{
	
	@Autowired
	private IContenidoCursoRepository repository;
	        
	
	@Override
	public List<ContenidoCurso> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<ContenidoCurso> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public ContenidoCurso save(ContenidoCurso contenidoCurso) {
		return this.repository.save(contenidoCurso);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}

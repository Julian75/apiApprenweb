package com.apprenweb.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apprenweb.Entity.Categoria;
import com.apprenweb.Repository.ICategoriaRepository;
import com.apprenweb.Service.ICategoriaService;

@Service
public class CategoriaServiceImplement implements ICategoriaService{
	
	@Autowired
	private ICategoriaRepository repository;
	        
	
	@Override
	public List<Categoria> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<Categoria> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public Categoria save(Categoria categoria) {
		return this.repository.save(categoria);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}

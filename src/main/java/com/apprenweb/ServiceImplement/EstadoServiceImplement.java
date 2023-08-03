package com.apprenweb.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apprenweb.Entity.Estado;
import com.apprenweb.Repository.IEstadoRepository;
import com.apprenweb.Service.IEstadoService;


@Service
public class EstadoServiceImplement implements  IEstadoService{


	@Autowired
	private IEstadoRepository repository;
	        
	
	@Override
	public List<Estado> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<Estado> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public Estado save(Estado estado) {
		return this.repository.save(estado);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}

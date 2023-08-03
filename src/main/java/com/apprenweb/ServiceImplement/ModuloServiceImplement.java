package com.apprenweb.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apprenweb.Entity.Modulo;
import com.apprenweb.Repository.IModuloRepository;
import com.apprenweb.Service.IModuloService;


@Service
public class ModuloServiceImplement implements IModuloService{

	
	@Autowired
	private IModuloRepository repository;
	        
	
	@Override
	public List<Modulo> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<Modulo> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public Modulo save(Modulo modulo) {
		return this.repository.save(modulo);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}

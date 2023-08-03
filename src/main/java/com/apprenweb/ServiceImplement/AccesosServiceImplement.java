package com.apprenweb.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apprenweb.Entity.Accesos;
import com.apprenweb.Repository.IAccesosRepository;
import com.apprenweb.Service.IAccesosService;


@Service
public class AccesosServiceImplement implements IAccesosService{
	
	@Autowired
	private IAccesosRepository repository;
	        
	
	@Override
	public List<Accesos> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<Accesos> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public Accesos save(Accesos accesos) {
		return this.repository.save(accesos);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}

}

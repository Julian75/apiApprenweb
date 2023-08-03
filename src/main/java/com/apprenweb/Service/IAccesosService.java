package com.apprenweb.Service;

import java.util.List;
import java.util.Optional;

import com.apprenweb.Entity.Accesos;


public interface IAccesosService {

	public List<Accesos> all();
	
	public Optional<Accesos> findById(Long id);
	
	public Accesos save(Accesos accesos);
	
	public void delete(Long id);
	
}
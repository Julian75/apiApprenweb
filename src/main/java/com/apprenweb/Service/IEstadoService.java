package com.apprenweb.Service;

import java.util.List;
import java.util.Optional;

import com.apprenweb.Entity.Estado;


public interface IEstadoService {
	
	public List<Estado> all();
	
	public Optional<Estado> findById(Long id);
	
	public Estado save(Estado estado);
	
	public void delete(Long id);

}

package com.apprenweb.Service;

import java.util.List;
import java.util.Optional;

import com.apprenweb.Entity.Categoria;

public interface ICategoriaService {

	public List<Categoria> all();
	
	public Optional<Categoria> findById(Long id);
	
	public Categoria save(Categoria categoria);
	
	public void delete(Long id);

}

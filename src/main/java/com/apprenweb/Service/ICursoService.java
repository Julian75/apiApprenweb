package com.apprenweb.Service;

import java.util.List;
import java.util.Optional;

import com.apprenweb.Entity.Curso;

public interface ICursoService {

	public List<Curso> all();
	
	public Optional<Curso> findById(Long id);
	
	public Curso save(Curso curso);
	
	public void delete(Long id);

}

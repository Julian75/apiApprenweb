package com.apprenweb.Service;

import java.util.List;
import java.util.Optional;

import com.apprenweb.Entity.SeccionCurso;

public interface ISeccionCursoService {

	public List<SeccionCurso> all();
	
	public Optional<SeccionCurso> findById(Long id);
	
	public SeccionCurso save(SeccionCurso seccionCurso);
	
	public void delete(Long id);

}

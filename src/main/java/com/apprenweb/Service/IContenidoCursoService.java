package com.apprenweb.Service;

import java.util.List;
import java.util.Optional;

import com.apprenweb.Entity.ContenidoCurso;

public interface IContenidoCursoService {

	public List<ContenidoCurso> all();
	
	public Optional<ContenidoCurso> findById(Long id);
	
	public ContenidoCurso save(ContenidoCurso contenidoCurso);
	
	public void delete(Long id);

}

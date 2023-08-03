package com.apprenweb.Service;

import java.util.List;
import java.util.Optional;

import com.apprenweb.Entity.CursoEstudiante;

public interface ICursoEstudianteService {

	public List<CursoEstudiante> all();
	
	public Optional<CursoEstudiante> findById(Long id);
	
	public CursoEstudiante save(CursoEstudiante cursoEstudiante);
	
	public void delete(Long id);

}

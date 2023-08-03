package com.apprenweb.Service;

import java.util.List;
import java.util.Optional;

import com.apprenweb.Entity.TemaCurso;

public interface ITemaCursoService {

	public List<TemaCurso> all();
	
	public Optional<TemaCurso> findById(Long id);
	
	public TemaCurso save(TemaCurso temaCurso);
	
	public void delete(Long id);

}

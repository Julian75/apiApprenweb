package com.apprenweb.Service;

import java.util.List;
import java.util.Optional;

import com.apprenweb.Entity.RespuestaEvaluacion;

public interface IRespuestaEvaluacionService {

	public List<RespuestaEvaluacion> all();
	
	public Optional<RespuestaEvaluacion> findById(Long id);
	
	public RespuestaEvaluacion save(RespuestaEvaluacion respuestaEvaluacion);
	
	public void delete(Long id);

}

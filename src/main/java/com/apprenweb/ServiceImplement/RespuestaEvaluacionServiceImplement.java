package com.apprenweb.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apprenweb.Entity.RespuestaEvaluacion;
import com.apprenweb.Repository.IRespuestaEvaluacionRepository;
import com.apprenweb.Service.IRespuestaEvaluacionService;

@Service
public class RespuestaEvaluacionServiceImplement implements IRespuestaEvaluacionService{
	
	@Autowired
	private IRespuestaEvaluacionRepository repository;
	        
	
	@Override
	public List<RespuestaEvaluacion> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<RespuestaEvaluacion> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public RespuestaEvaluacion save(RespuestaEvaluacion respuestaEvaluacion) {
		return this.repository.save(respuestaEvaluacion);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}

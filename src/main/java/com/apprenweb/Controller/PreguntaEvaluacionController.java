package com.apprenweb.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.apprenweb.Entity.PreguntaEvaluacion;
import com.apprenweb.Service.IPreguntaEvaluacionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/PreguntaEvaluacion")
public class PreguntaEvaluacionController {

	@Autowired IPreguntaEvaluacionService service;

	@GetMapping("/Obtener")
	public List<PreguntaEvaluacion> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<PreguntaEvaluacion> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public PreguntaEvaluacion save(@RequestBody PreguntaEvaluacion PreguntaEvaluacion) {
		return service.save(PreguntaEvaluacion);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public PreguntaEvaluacion update(@PathVariable Long id, @RequestBody PreguntaEvaluacion preguntaEvaluacion) {	
		Optional<PreguntaEvaluacion> op = service.findById(id);
		
		PreguntaEvaluacion preguntaEvaluacionUpdate = new PreguntaEvaluacion();
		if (!op.isEmpty()) {			
			preguntaEvaluacionUpdate = op.get();					
			preguntaEvaluacionUpdate= preguntaEvaluacion;			
			preguntaEvaluacionUpdate.setId(id);
			
		}
		return service.save(preguntaEvaluacionUpdate);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}

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

import com.apprenweb.Entity.RespuestaEvaluacion;
import com.apprenweb.Service.IRespuestaEvaluacionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/RespuestaEvaluacion")
public class RespuestaEvaluacionController {

	@Autowired IRespuestaEvaluacionService service;

	@GetMapping("/Obtener")
	public List<RespuestaEvaluacion> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<RespuestaEvaluacion> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public RespuestaEvaluacion save(@RequestBody RespuestaEvaluacion RespuestaEvaluacion) {
		return service.save(RespuestaEvaluacion);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public RespuestaEvaluacion update(@PathVariable Long id, @RequestBody RespuestaEvaluacion respuestaEvaluacion) {	
		Optional<RespuestaEvaluacion> op = service.findById(id);
		
		RespuestaEvaluacion respuestaEvaluacionUpdate = new RespuestaEvaluacion();
		if (!op.isEmpty()) {			
			respuestaEvaluacionUpdate = op.get();					
			respuestaEvaluacionUpdate= respuestaEvaluacion;			
			respuestaEvaluacionUpdate.setId(id);
			
		}
		return service.save(respuestaEvaluacionUpdate);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}

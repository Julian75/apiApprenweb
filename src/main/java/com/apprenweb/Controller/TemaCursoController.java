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

import com.apprenweb.Entity.TemaCurso;
import com.apprenweb.Service.ITemaCursoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/TemaCurso")
public class TemaCursoController {

	@Autowired ITemaCursoService service;

	@GetMapping("/Obtener")
	public List<TemaCurso> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<TemaCurso> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public TemaCurso save(@RequestBody TemaCurso TemaCurso) {
		return service.save(TemaCurso);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public TemaCurso update(@PathVariable Long id, @RequestBody TemaCurso temaCurso) {	
		Optional<TemaCurso> op = service.findById(id);
		
		TemaCurso temaCursoUpdate = new TemaCurso();
		if (!op.isEmpty()) {			
			temaCursoUpdate = op.get();					
			temaCursoUpdate= temaCurso;			
			temaCursoUpdate.setId(id);
			
		}
		return service.save(temaCursoUpdate);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}

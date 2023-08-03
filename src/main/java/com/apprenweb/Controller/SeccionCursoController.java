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

import com.apprenweb.Entity.SeccionCurso;
import com.apprenweb.Service.ISeccionCursoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/SeccionCurso")
public class SeccionCursoController {

	@Autowired ISeccionCursoService service;

	@GetMapping("/Obtener")
	public List<SeccionCurso> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<SeccionCurso> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public SeccionCurso save(@RequestBody SeccionCurso SeccionCurso) {
		return service.save(SeccionCurso);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public SeccionCurso update(@PathVariable Long id, @RequestBody SeccionCurso seccionCurso) {	
		Optional<SeccionCurso> op = service.findById(id);
		
		SeccionCurso seccionCursoUpdate = new SeccionCurso();
		if (!op.isEmpty()) {			
			seccionCursoUpdate = op.get();					
			seccionCursoUpdate= seccionCurso;			
			seccionCursoUpdate.setId(id);
			
		}
		return service.save(seccionCursoUpdate);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}

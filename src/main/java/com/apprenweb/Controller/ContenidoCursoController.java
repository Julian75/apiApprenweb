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

import com.apprenweb.Entity.ContenidoCurso;
import com.apprenweb.Service.IContenidoCursoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ContenidoCurso")
public class ContenidoCursoController {

	@Autowired IContenidoCursoService service;

	@GetMapping("/Obtener")
	public List<ContenidoCurso> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<ContenidoCurso> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ContenidoCurso save(@RequestBody ContenidoCurso ContenidoCurso) {
		return service.save(ContenidoCurso);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ContenidoCurso update(@PathVariable Long id, @RequestBody ContenidoCurso contenidoCurso) {	
		Optional<ContenidoCurso> op = service.findById(id);
		
		ContenidoCurso contenidoCursoUpdate = new ContenidoCurso();
		if (!op.isEmpty()) {			
			contenidoCursoUpdate = op.get();					
			contenidoCursoUpdate= contenidoCurso;			
			contenidoCursoUpdate.setId(id);
			
		}
		return service.save(contenidoCursoUpdate);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}

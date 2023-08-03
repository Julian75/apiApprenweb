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

import com.apprenweb.Entity.Curso;
import com.apprenweb.Service.ICursoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Curso")
public class CursoController {

	@Autowired ICursoService service;

	@GetMapping("/Obtener")
	public List<Curso> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<Curso> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Curso save(@RequestBody Curso Curso) {
		return service.save(Curso);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Curso update(@PathVariable Long id, @RequestBody Curso curso) {	
		Optional<Curso> op = service.findById(id);
		
		Curso cursoUpdate = new Curso();
		if (!op.isEmpty()) {			
			cursoUpdate = op.get();					
			cursoUpdate= curso;			
			cursoUpdate.setId(id);
			
		}
		return service.save(cursoUpdate);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}

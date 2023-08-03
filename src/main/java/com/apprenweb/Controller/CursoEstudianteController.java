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

import com.apprenweb.Entity.CursoEstudiante;
import com.apprenweb.Service.ICursoEstudianteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/CursoEstudiante")
public class CursoEstudianteController {

	@Autowired ICursoEstudianteService service;

	@GetMapping("/Obtener")
	public List<CursoEstudiante> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<CursoEstudiante> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public CursoEstudiante save(@RequestBody CursoEstudiante CursoEstudiante) {
		return service.save(CursoEstudiante);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public CursoEstudiante update(@PathVariable Long id, @RequestBody CursoEstudiante cursoEstudiante) {	
		Optional<CursoEstudiante> op = service.findById(id);
		
		CursoEstudiante cursoEstudianteUpdate = new CursoEstudiante();
		if (!op.isEmpty()) {			
			cursoEstudianteUpdate = op.get();					
			cursoEstudianteUpdate= cursoEstudiante;			
			cursoEstudianteUpdate.setId(id);
			
		}
		return service.save(cursoEstudianteUpdate);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}

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

import com.apprenweb.Entity.EvaluacionSeccionEstudiante;
import com.apprenweb.Service.IEvaluacionSeccionEstudianteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/EvaluacionSeccionEstudiante")
public class EvaluacionSeccionEstudianteController {

	@Autowired IEvaluacionSeccionEstudianteService service;

	@GetMapping("/Obtener")
	public List<EvaluacionSeccionEstudiante> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<EvaluacionSeccionEstudiante> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public EvaluacionSeccionEstudiante save(@RequestBody EvaluacionSeccionEstudiante EvaluacionSeccionEstudiante) {
		return service.save(EvaluacionSeccionEstudiante);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public EvaluacionSeccionEstudiante update(@PathVariable Long id, @RequestBody EvaluacionSeccionEstudiante evaluacionSeccionEstudiante) {	
		Optional<EvaluacionSeccionEstudiante> op = service.findById(id);
		
		EvaluacionSeccionEstudiante evaluacionSeccionEstudianteUpdate = new EvaluacionSeccionEstudiante();
		if (!op.isEmpty()) {			
			evaluacionSeccionEstudianteUpdate = op.get();					
			evaluacionSeccionEstudianteUpdate= evaluacionSeccionEstudiante;			
			evaluacionSeccionEstudianteUpdate.setId(id);
			
		}
		return service.save(evaluacionSeccionEstudianteUpdate);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}

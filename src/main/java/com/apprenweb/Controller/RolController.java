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

import com.apprenweb.Entity.Rol;
import com.apprenweb.Service.IRolService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Rol")
public class RolController {
	
	@Autowired IRolService service;

	@GetMapping("/Obtener")
	public List<Rol> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<Rol> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Rol save(@RequestBody Rol rol) {
		return service.save(rol);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Rol update(@PathVariable Long id, @RequestBody Rol rol) {	
		Optional<Rol> op = service.findById(id);
		
		Rol rolUpdate = new Rol();
		if (!op.isEmpty()) {			
			rolUpdate = op.get();					
			rolUpdate= rol;			
			rolUpdate.setId(id);
			
		}
		return service.save(rol);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
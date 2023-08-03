package com.apprenweb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.apprenweb.EntityModifica.AccesoModificar;
import com.apprenweb.EntityModifica.CategoriaModificar;
import com.apprenweb.EntityModifica.ContenidoCursoModificar;
import com.apprenweb.EntityModifica.CursoEstudianteModificar;
import com.apprenweb.EntityModifica.CursoModificar;
import com.apprenweb.EntityModifica.EstadoModificar;
import com.apprenweb.EntityModifica.EvaluacionSeccionEstudianteModificar;
import com.apprenweb.EntityModifica.ModuloModificar;
import com.apprenweb.EntityModifica.PreguntaEvaluacionModificar;
import com.apprenweb.EntityModifica.RespuestaEvaluacionModificar;
import com.apprenweb.EntityModifica.RolModificar;
import com.apprenweb.EntityModifica.SeccionCursoModificar;
import com.apprenweb.EntityModifica.TemaCursoModificar;
import com.apprenweb.EntityModifica.TipoDocumentoModificar;
import com.apprenweb.EntityModifica.UsuarioModificar;
import com.apprenweb.Service.IModificarService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Modificar")
public class ModificarController {

	@Autowired IModificarService modificarService;

	@PutMapping("/Acceso/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody AccesoModificar confi) {
		AccesoModificar _tutorial = modificarService.findByIdAcceso(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setIdRol(confi.getIdRol());
	      _tutorial.setIdModulo(confi.getIdModulo());
	      modificarService.modificarAcceso(confi);
	    } 
	    return null;
	  }

	@PutMapping("/Categoria/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody CategoriaModificar confi) {
		CategoriaModificar _tutorial = modificarService.findByIdCategoria(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setDescripcion(confi.getDescripcion());
	      _tutorial.setIdEstado(confi.getIdEstado());
	      modificarService.modificarCategoria(confi);
	    } 
	    return null;
	  }

	@PutMapping("/ContenidoCurso/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody ContenidoCursoModificar confi) {
		ContenidoCursoModificar _tutorial = modificarService.findByIdContenidoCurso(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setDescripcionArchivo(confi.getDescripcionArchivo());
	      _tutorial.setIdTemaCurso(confi.getIdTemaCurso());
	      _tutorial.setIdEstado(confi.getIdEstado());
	      _tutorial.setObservacion(confi.getObservacion());
	      modificarService.modificarContenidoCurso(confi);
	    } 
	    return null;
	  }

	@PutMapping("/CursoEstudiante/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody CursoEstudianteModificar confi) {
		CursoEstudianteModificar _tutorial = modificarService.findByIdCursoEstudiante(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setIdUsuario(confi.getIdUsuario());
	      _tutorial.setIdCurso(confi.getIdCurso());
	      _tutorial.setIdEstado(confi.getIdEstado());
	      _tutorial.setFecha(confi.getFecha());
	      modificarService.modificarCursoEstudiante(confi);
	    } 
	    return null;
	  }

	@PutMapping("/Curso/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody CursoModificar confi) {
		CursoModificar _tutorial = modificarService.findByIdCurso(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setTitulo(confi.getTitulo());
	      _tutorial.setDescripcion(confi.getDescripcion());
	      _tutorial.setIdCategoria(confi.getIdCategoria());
	      _tutorial.setIdUsuario(confi.getIdUsuario());
	      modificarService.modificarCurso(confi);
	    } 
	    return null;
	  }

	@PutMapping("/Estado/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody EstadoModificar confi) {
		EstadoModificar _tutorial = modificarService.findByIdEstado(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setDescripcion(confi.getDescripcion());
	      _tutorial.setObservacion(confi.getObservacion());
	      _tutorial.setIdModulo(confi.getIdModulo());
	      modificarService.modificarEstado(confi);
	    } 
	    return null;
	  }

	@PutMapping("/EvaluacionSeccionEstudiante/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody EvaluacionSeccionEstudianteModificar confi) {
		EvaluacionSeccionEstudianteModificar _tutorial = modificarService.findByIdEvaluacionSeccion(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setIdPreguntaEvaluacion(confi.getIdPreguntaEvaluacion());
	      _tutorial.setIdRespuestaEvaluacion(confi.getIdRespuestaEvaluacion());
	      _tutorial.setIdUsuario(confi.getIdUsuario());
	      _tutorial.setIdEstado(confi.getIdEstado());
	      modificarService.modificarEvaluacionSeccion(confi);
	    } 
	    return null;
	  }

	@PutMapping("/Modulo/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody ModuloModificar confi) {
		ModuloModificar _tutorial = modificarService.findByIdModulo(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setDescripcion(confi.getDescripcion());
	      modificarService.modificarModulo(confi);
	    } 
	    return null;
	  }

	@PutMapping("/PreguntaEvaluacion/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody PreguntaEvaluacionModificar confi) {
		PreguntaEvaluacionModificar _tutorial = modificarService.findByIdPreguntaEvaluacion(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setDescripcion(confi.getDescripcion());
	      _tutorial.setIdEstado(confi.getIdEstado());
	      _tutorial.setIdTemaCurso(confi.getIdTemaCurso());
	      modificarService.modificarPreguntaEvaluacion(confi);
	    } 
	    return null;
	  }

	@PutMapping("/RespuestaEvaluacion/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody RespuestaEvaluacionModificar confi) {
		RespuestaEvaluacionModificar _tutorial = modificarService.findByIdRespuestaEvaluacion(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setDescripcion(confi.getDescripcion());
	      _tutorial.setIdPreguntaEvaluacion(confi.getIdPreguntaEvaluacion());
	      _tutorial.setCorrecta(confi.isCorrecta());
	      _tutorial.setIdEstado(confi.getIdEstado());
	      modificarService.modificarRespuestaEvaluacion(confi);
	    } 
	    return null;
	  }

	@PutMapping("/Rol/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody RolModificar confi) {
		RolModificar _tutorial = modificarService.findByIdRol(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setDescripcion(confi.getDescripcion());
	      _tutorial.setIdEstado(confi.getIdEstado());
	      modificarService.modificarRol(confi);
	    } 
	    return null;
	  }

	@PutMapping("/SeccionCurso/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody SeccionCursoModificar confi) {
		SeccionCursoModificar _tutorial = modificarService.findByIdSeccionCurso(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setDescripcion(confi.getDescripcion());
	      _tutorial.setFase(confi.getFase());
	      _tutorial.setIdEstado(confi.getIdEstado());
	      _tutorial.setIdCurso(confi.getIdCurso());
	      modificarService.modificarSeccionCurso(confi);
	    } 
	    return null;
	  }

	@PutMapping("/TipoDocumento/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody TipoDocumentoModificar confi) {
		TipoDocumentoModificar _tutorial = modificarService.findByIdTipoDocumento(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setDescripcion(confi.getDescripcion());
	      _tutorial.setIdEstado(confi.getIdEstado());
	      modificarService.modificarTipoDocumento(confi);
	    } 
	    return null;
	  }

	@PutMapping("/Usuario/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody UsuarioModificar confi) {
		UsuarioModificar _tutorial = modificarService.findByIdUsuario(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setNombre(confi.getNombre());
	      _tutorial.setApellido(confi.getApellido());
	      _tutorial.setCorreo(confi.getCorreo());
	      _tutorial.setDocumento(confi.getDocumento());
	      _tutorial.setPassword(confi.getPassword());
	      _tutorial.setIdEstado(confi.getIdEstado());
	      _tutorial.setIdTipoDocumento(confi.getIdTipoDocumento());
	      _tutorial.setIdRol(confi.getIdRol());
	      modificarService.modificarUsuario(confi);
	    } 
	    return null;
	  }
	
	@PutMapping("/TemaCurso/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	  public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody TemaCursoModificar confi) {
		TemaCursoModificar _tutorial = modificarService.findByIdTemaCurso(id);
	    if (_tutorial != null) {
	      _tutorial.setId(id);
	      _tutorial.setDescripcion(confi.getDescripcion());
	      _tutorial.setIdEstado(confi.getIdEstado());
	      _tutorial.setIdSeccionCurso(confi.getIdSeccionCurso());
	      _tutorial.setEvaluacion(confi.getEvaluacion());
	      modificarService.modificarTemasCurso(confi);
	    } 
	    return null;
	  }
}

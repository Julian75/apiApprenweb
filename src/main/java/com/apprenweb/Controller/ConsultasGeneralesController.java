package com.apprenweb.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apprenweb.EntityConsulta.AccesoConsulta;
import com.apprenweb.EntityConsulta.ContenidoCursoConsulta;
import com.apprenweb.EntityConsulta.CursoConsulta;
import com.apprenweb.EntityConsulta.CursoEstudianteConsulta;
import com.apprenweb.EntityConsulta.EstadoConsulta;
import com.apprenweb.EntityConsulta.EvaluacionesResueltasConsulta;
import com.apprenweb.EntityConsulta.PreguntaEvaluacionConsulta;
import com.apprenweb.EntityConsulta.RespuestaEvaluacionConsulta;
import com.apprenweb.EntityConsulta.RolesConsulta;
import com.apprenweb.EntityConsulta.TipoDocumentoConsulta;
import com.apprenweb.EntityModifica.CategoriaModificar;
import com.apprenweb.EntityModifica.CursoEstudianteModificar;
import com.apprenweb.EntityModifica.CursoModificar;
import com.apprenweb.EntityModifica.EstadoModificar;
import com.apprenweb.EntityModifica.EvaluacionSeccionEstudianteModificar;
import com.apprenweb.EntityModifica.PreguntaEvaluacionModificar;
import com.apprenweb.EntityModifica.SeccionCursoModificar;
import com.apprenweb.EntityModifica.TemaCursoModificar;
import com.apprenweb.EntityModifica.UsuarioModificar;
import com.apprenweb.Service.IConsultasGeneralesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ConsultasGenerales")
public class ConsultasGeneralesController {

	@Autowired IConsultasGeneralesService consultasService;
	
	@GetMapping("/ObtenerEstadosIdModulo")
	public ResponseEntity<List<EstadoModificar>> getAllEstadoIdModulo(Long idModulo) {
	    try {
	      List<EstadoModificar> datos = new ArrayList<EstadoModificar>();
	      consultasService.findByEstadoIdModulo(idModulo).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerRoles")
	public ResponseEntity<List<RolesConsulta>> getAllRoles(Long opcion) {
	    try {
	      List<RolesConsulta> datos = new ArrayList<RolesConsulta>();
	      consultasService.findByRoles(opcion).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }

	@GetMapping("/ObtenerAccesos")
	public ResponseEntity<List<AccesoConsulta>> getAllAccesos() {
	    try {
	      List<AccesoConsulta> datos = new ArrayList<AccesoConsulta>();
	      consultasService.findByAccesos().forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }

	@GetMapping("/ObtenerEstados")
	public ResponseEntity<List<EstadoConsulta>> getAllEstados() {
	    try {
	      List<EstadoConsulta> datos = new ArrayList<EstadoConsulta>();
	      consultasService.findByEstados().forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }

	@GetMapping("/ObtenerTipoDocumentoActivos")
	public ResponseEntity<List<TipoDocumentoConsulta>> getAllTipoDocumentoActivos() {
	    try {
	      List<TipoDocumentoConsulta> datos = new ArrayList<TipoDocumentoConsulta>();
	      consultasService.findByTipoDocumentosActivos().forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerMisCursos")
	public ResponseEntity<List<CursoConsulta>> getAllMisCursos(int decision, Long idUsuario) {
	    try {
	      List<CursoConsulta> datos = new ArrayList<CursoConsulta>();
	      consultasService.findByMisCursos(decision, idUsuario).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerUsuariosActivos")
	public ResponseEntity<List<UsuarioModificar>> getAllTipoUsuariosActivos() {
	    try {
	      List<UsuarioModificar> datos = new ArrayList<UsuarioModificar>();
	      consultasService.findByUsuariosActivos().forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }

	@GetMapping("/ObtenerCategoriasActivas")
	public ResponseEntity<List<CategoriaModificar>> getAllCategoriasActivas() {
	    try {
	      List<CategoriaModificar> datos = new ArrayList<CategoriaModificar>();
	      consultasService.findByCategoriasActivas().forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerSeccionesCurso")
	public ResponseEntity<List<CursoConsulta>> getAllSeccionesCurso(Long idCurso) {
	    try {
	      List<CursoConsulta> datos = new ArrayList<CursoConsulta>();
	      consultasService.findBySeccionesCurso(idCurso).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }

	@GetMapping("/ObtenerSeccionCursoActivos")
	public ResponseEntity<List<SeccionCursoModificar>> getAllSeccionesCursoActivos(Long idCurso) {
	    try {
	      List<SeccionCursoModificar> datos = new ArrayList<SeccionCursoModificar>();
	      consultasService.findBySeccionCursoActivo(idCurso).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }

	@GetMapping("/ObtenerCursoEstudianteIdCurso")
	public ResponseEntity<List<CursoEstudianteConsulta>> getAllCursoEstudianteIdCurso(Long idCurso) {
	    try {
	      List<CursoEstudianteConsulta> datos = new ArrayList<CursoEstudianteConsulta>();
	      consultasService.findByCursoEstudianteIdCurso(idCurso).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerPreguntasIdCurso")
	public ResponseEntity<List<PreguntaEvaluacionConsulta>> getAllPreguntasIdCurso(Long idCurso) {
	    try {
	      List<PreguntaEvaluacionConsulta> datos = new ArrayList<PreguntaEvaluacionConsulta>();
	      consultasService.findByPreguntasIdCurso(idCurso).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }

	@GetMapping("/ObtenerRespuestaIdPregunta")
	public ResponseEntity<List<RespuestaEvaluacionConsulta>> getAllRespuestaIdPregunta(Long idPregunta) {
	    try {
	      List<RespuestaEvaluacionConsulta> datos = new ArrayList<RespuestaEvaluacionConsulta>();
	      consultasService.findByRespuestaIdPregunta(idPregunta).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerCursoRegistrado")
	public ResponseEntity<List<CursoConsulta>> getAllCursoRegistrado(String tituloCurso, Long idCategoriaCurso, String descripcion, Long idUsuario, Long idEstado) {
	    try {
	      List<CursoConsulta> datos = new ArrayList<CursoConsulta>();
	      consultasService.findByCursoRegistrado(tituloCurso, idCategoriaCurso, descripcion, idUsuario, idEstado).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerContenidoCursoIdCategoria")
	public ResponseEntity<List<ContenidoCursoConsulta>> getAllContenidoCursoIdCategoria(Long idCategoria, int opcion, Long idUsuario) {
	    try {
	      List<ContenidoCursoConsulta> datos = new ArrayList<ContenidoCursoConsulta>();
	      consultasService.findByContenidoCursoIdCategoria(idCategoria, opcion, idUsuario).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerContenidoCursoIdCurso")
	public ResponseEntity<List<ContenidoCursoConsulta>> getAllContenidoCursoIdCurso(Long idCurso) {
	    try {
	      List<ContenidoCursoConsulta> datos = new ArrayList<ContenidoCursoConsulta>();
	      consultasService.findByContenidoCursoIdCurso(idCurso).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerTemasYContenidoCurso")
	public ResponseEntity<List<ContenidoCursoConsulta>> getAllTemaCursoContenido() {
	    try {
	      List<ContenidoCursoConsulta> datos = new ArrayList<ContenidoCursoConsulta>();
	      consultasService.findByTemaCursoContenido().forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerCursoEstudianteExistente")
	public ResponseEntity<List<CursoEstudianteModificar>> getAllCursoEstudianteExistente(Long idUsuario, Long idCategoria) {
	    try {
	      List<CursoEstudianteModificar> datos = new ArrayList<CursoEstudianteModificar>();
	      consultasService.findByCursoEstudianteExistente(idUsuario, idCategoria).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }

	@GetMapping("/ObtenerTemasActivos")
	public ResponseEntity<List<TemaCursoModificar>> getAllTemasCursoActivos(Long idSeccion) {
	    try {
	      List<TemaCursoModificar> datos = new ArrayList<TemaCursoModificar>();
	      consultasService.findByTemaCursoActivo(idSeccion).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerTemasCursosEvaluacionRealizados")
	public ResponseEntity<List<TemaCursoModificar>> getAllEvaluacionSeccionEstudiante(Long idCurso, Long idUsuario) {
	    try {
	      List<TemaCursoModificar> datos = new ArrayList<TemaCursoModificar>();
	      consultasService.findByEvaluacionSeccionEstudiante(idCurso, idUsuario).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerTodosTemasCurso")
	public ResponseEntity<List<TemaCursoModificar>> getAllTemaCursoActivoidCurso(Long idCurso) {
	    try {
	      List<TemaCursoModificar> datos = new ArrayList<TemaCursoModificar>();
	      consultasService.findByTemaCursoActivoidCurso(idCurso).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerPreguntasIdTemaCurso")
	public ResponseEntity<List<PreguntaEvaluacionConsulta>> getAllPreguntasIdTemaCurso(Long idTemaCurso) {
	    try {
	      List<PreguntaEvaluacionConsulta> datos = new ArrayList<PreguntaEvaluacionConsulta>();
	      consultasService.findByPreguntasIdTemaCurso(idTemaCurso).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerRespuestasIdTemaCurso")
	public ResponseEntity<List<RespuestaEvaluacionConsulta>> getAllRespuestasIdTemaCurso(Long idTemaCurso) {
	    try {
	      List<RespuestaEvaluacionConsulta> datos = new ArrayList<RespuestaEvaluacionConsulta>();
	      consultasService.findByRespuestasIdTemaCurso(idTemaCurso).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerCursosActivosCategoria")
	public ResponseEntity<List<CursoModificar>> getAllCursosIdCategoria(Long idCategoria) {
	    try {
	      List<CursoModificar> datos = new ArrayList<CursoModificar>();
	      consultasService.findByCursosIdCategoria(idCategoria).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerTemasEvaluacionCurso")
	public ResponseEntity<List<PreguntaEvaluacionConsulta>> getAllTemasEvaluacionCurso(Long idCurso, Long idUsuario) {
	    try {
	      List<PreguntaEvaluacionConsulta> datos = new ArrayList<PreguntaEvaluacionConsulta>();
	      consultasService.findByTemasEvaluacionCurso(idCurso, idUsuario).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerContenidoCursoIdTema")
	public ResponseEntity<List<ContenidoCursoConsulta>> getAllContenidoCursoIdTema(Long idTema) {
	    try {
	      List<ContenidoCursoConsulta> datos = new ArrayList<ContenidoCursoConsulta>();
	      consultasService.findByContenidoCursoIdTema(idTema).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerEvaluacionResueltaUsuTema")
	public ResponseEntity<List<EvaluacionSeccionEstudianteModificar>> getAllEvaluacionResueltaUsuTema(Long idUsuario, Long idTema) {
	    try {
	      List<EvaluacionSeccionEstudianteModificar> datos = new ArrayList<EvaluacionSeccionEstudianteModificar>();
	      consultasService.findByEvaluacionesResueltasUsuTema(idUsuario, idTema).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }

	@GetMapping("/ObtenerTrazabilidadTemasEvaluacion")
	public ResponseEntity<List<EvaluacionesResueltasConsulta>> getAllTemasEvaluacionEstudiante(Long idUsuario) {
	    try {
	      List<EvaluacionesResueltasConsulta> datos = new ArrayList<EvaluacionesResueltasConsulta>();
	      consultasService.findByTemasEvaluacionEstudiante(idUsuario).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerPreguntasTema")
	public ResponseEntity<List<PreguntaEvaluacionModificar>> getAllPreguntasIdTema(Long idTema) {
	    try {
	      List<PreguntaEvaluacionModificar> datos = new ArrayList<PreguntaEvaluacionModificar>();
	      consultasService.findByPreguntasIdTema(idTema).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
}

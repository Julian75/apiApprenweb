package com.apprenweb.Service;

import java.util.List;

import com.apprenweb.EntityConsulta.AccesoConsulta;
import com.apprenweb.EntityConsulta.ContenidoCursoConsulta;
import com.apprenweb.EntityConsulta.CursoConsulta;
import com.apprenweb.EntityConsulta.CursoEstudianteConsulta;
import com.apprenweb.EntityConsulta.EstadoConsulta;
import com.apprenweb.EntityConsulta.EvaluacionEstudianteConsulta;
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

public interface IConsultasGeneralesService {

	List<EstadoModificar> findByEstadoIdModulo(Long idModulo);
	List<RolesConsulta> findByRoles(Long opcion);
	List<AccesoConsulta> findByAccesos();
	List<EstadoConsulta> findByEstados();
	List<TipoDocumentoConsulta> findByTipoDocumentosActivos();
	List<CursoConsulta> findByMisCursos(int decision, Long idUsuario);
	List<UsuarioModificar> findByUsuariosActivos();
	List<CategoriaModificar> findByCategoriasActivas();
	List<CursoConsulta> findBySeccionesCurso(Long idCurso);
	List<SeccionCursoModificar> findBySeccionCursoActivo(Long idCurso);
	List<CursoEstudianteConsulta> findByCursoEstudianteIdCurso(Long idCurso);
	List<PreguntaEvaluacionConsulta> findByPreguntasIdCurso(Long idCurso);
	List<RespuestaEvaluacionConsulta> findByRespuestaIdPregunta(Long idPregunta);
	List<CursoConsulta> findByCursoRegistrado(String tituloCurso, Long idCategoriaCurso, String descripcion, Long idUsuario, Long idEstado);
	List<ContenidoCursoConsulta> findByContenidoCursoIdCategoria(Long idCategoria, int opcion, Long idUsuario);
	List<ContenidoCursoConsulta> findByContenidoCursoIdCurso(Long idCurso);
	List<ContenidoCursoConsulta> findByTemaCursoContenido();
	List<CursoEstudianteModificar> findByCursoEstudianteExistente(Long idUsuario, Long idCategoria);
	List<TemaCursoModificar> findByTemaCursoActivo(Long idSeccion);
	List<TemaCursoModificar> findByEvaluacionSeccionEstudiante(Long idCurso, Long idUsuario);
	List<TemaCursoModificar> findByTemaCursoActivoidCurso(Long idCurso);
	List<PreguntaEvaluacionConsulta> findByPreguntasIdTemaCurso(Long idTemaCurso);
	List<RespuestaEvaluacionConsulta> findByRespuestasIdTemaCurso(Long idTemaCurso);
	List<CursoModificar> findByCursosIdCategoria(Long idCategoria);
	List<PreguntaEvaluacionConsulta> findByTemasEvaluacionCurso(Long idCurso, Long idUsuario);
	List<ContenidoCursoConsulta> findByContenidoCursoIdTema(Long idTema);
	List<EvaluacionSeccionEstudianteModificar> findByEvaluacionesResueltasUsuTema(Long idUsuario, Long idTema);
	List<EvaluacionesResueltasConsulta> findByTemasEvaluacionEstudiante(Long idUsuario);
	List<PreguntaEvaluacionModificar> findByPreguntasIdTema(Long idTema);
}

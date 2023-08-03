package com.apprenweb.Service;

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

public interface IModificarService {

//	Acceso
	int modificarAcceso(AccesoModificar acceso);
	AccesoModificar findByIdAcceso(Long id);

//	Categoria
	int modificarCategoria(CategoriaModificar categoria);
	CategoriaModificar findByIdCategoria(Long id);

//	Contenido Curso
	int modificarContenidoCurso(ContenidoCursoModificar contenidoCurso);
	ContenidoCursoModificar findByIdContenidoCurso(Long id);

//	Curso Estudiante
	int modificarCursoEstudiante(CursoEstudianteModificar cursoEstudianteModificar);
	CursoEstudianteModificar findByIdCursoEstudiante(Long id);

//	Curso
	int modificarCurso(CursoModificar curso);
	CursoModificar findByIdCurso(Long id);

//	Estado
	int modificarEstado(EstadoModificar estado);
	EstadoModificar findByIdEstado(Long id);

//	Evaluacion Seccion Estudiante
	int modificarEvaluacionSeccion(EvaluacionSeccionEstudianteModificar evaluacionSeccion);
	EvaluacionSeccionEstudianteModificar findByIdEvaluacionSeccion(Long id);

//	Modulo
	int modificarModulo(ModuloModificar modulo);
	ModuloModificar findByIdModulo(Long id);

//	Pregunta Evaluacion
	int modificarPreguntaEvaluacion(PreguntaEvaluacionModificar preguntaEvaluacion);
	PreguntaEvaluacionModificar findByIdPreguntaEvaluacion(Long id);

//	Respuesta Evaluacion
	int modificarRespuestaEvaluacion(RespuestaEvaluacionModificar respuestaEvaluacion);
	RespuestaEvaluacionModificar findByIdRespuestaEvaluacion(Long id);

//	Rol
	int modificarRol(RolModificar rol);
	RolModificar findByIdRol(Long id);

//	Seccion Curso
	int modificarSeccionCurso(SeccionCursoModificar seccionCurso);
	SeccionCursoModificar findByIdSeccionCurso(Long id);

//	Tipo Documento
	int modificarTipoDocumento(TipoDocumentoModificar tipoDocumento);
	TipoDocumentoModificar findByIdTipoDocumento(Long id);

//	Usuario
	int modificarUsuario(UsuarioModificar usuario);
	UsuarioModificar findByIdUsuario(Long id);
	
//	Temas Curso
	int modificarTemasCurso(TemaCursoModificar temaCurso);
	TemaCursoModificar findByIdTemaCurso(Long id);
}

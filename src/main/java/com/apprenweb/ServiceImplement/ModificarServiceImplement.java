package com.apprenweb.ServiceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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

@Repository
public class ModificarServiceImplement implements IModificarService{

	@Autowired
	private JdbcTemplate jdbcTemplate;

//	Acceso
	@Override
	  public AccesoModificar findByIdAcceso(Long id) {
	    try {
	    	AccesoModificar acceso = jdbcTemplate.queryForObject("SELECT * FROM accesos WHERE id=?",
	          BeanPropertyRowMapper.newInstance(AccesoModificar.class), id);
	      return acceso;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarAcceso(AccesoModificar acceso) {
	    return jdbcTemplate.update("UPDATE accesos SET id_rol = ?, id_modulo = ? WHERE id = ?",
	    		new Object[] { acceso.getIdRol(), acceso.getIdModulo(), acceso.getId()});
	  }

//	Categoria
	@Override
	  public CategoriaModificar findByIdCategoria(Long id) {
	    try {
	    	CategoriaModificar categoria = jdbcTemplate.queryForObject("SELECT * FROM categoria WHERE id=?",
	          BeanPropertyRowMapper.newInstance(CategoriaModificar.class), id);
	      return categoria;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarCategoria(CategoriaModificar categoria) {
	    return jdbcTemplate.update("UPDATE categoria SET descripcion = ?, id_estado = ? WHERE id = ?",
	    		new Object[] { categoria.getDescripcion(), categoria.getIdEstado(), categoria.getId()});
	  }

//	Contenido Curso
	@Override
	  public ContenidoCursoModificar findByIdContenidoCurso(Long id) {
	    try {
	    	ContenidoCursoModificar contenidoCurso = jdbcTemplate.queryForObject("SELECT * FROM contenido_curso WHERE id=?",
	          BeanPropertyRowMapper.newInstance(ContenidoCursoModificar.class), id);
	      return contenidoCurso;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarContenidoCurso(ContenidoCursoModificar contenidoCurso) {
	    return jdbcTemplate.update("UPDATE contenido_curso SET descripcion_archivo = ?, id_tema_curso = ?, id_estado = ?, observacion = ? WHERE id = ?",
	    		new Object[] { contenidoCurso.getDescripcionArchivo(), contenidoCurso.getIdTemaCurso(), contenidoCurso.getIdEstado(), contenidoCurso.getObservacion(), contenidoCurso.getId()});
	  }

//	Curso Estudiante
	@Override
	  public CursoEstudianteModificar findByIdCursoEstudiante(Long id) {
	    try {
	    	CursoEstudianteModificar cursoEstudiante = jdbcTemplate.queryForObject("SELECT * FROM curso_estudiante WHERE id=?",
	          BeanPropertyRowMapper.newInstance(CursoEstudianteModificar.class), id);
	      return cursoEstudiante;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarCursoEstudiante(CursoEstudianteModificar cursoEstudiante) {
	    return jdbcTemplate.update("UPDATE curso_estudiante SET id_usuario = ?, id_curso = ?, id_estado = ?, fecha = ? WHERE id = ?",
	    		new Object[] { cursoEstudiante.getIdUsuario(), cursoEstudiante.getIdCurso(), cursoEstudiante.getIdEstado(), cursoEstudiante.getFecha(), cursoEstudiante.getId()});
	  }

//	Curso 
	@Override
	  public CursoModificar findByIdCurso(Long id) {
	    try {
	    	CursoModificar curso = jdbcTemplate.queryForObject("SELECT * FROM curso WHERE id=?",
	          BeanPropertyRowMapper.newInstance(CursoModificar.class), id);
	      return curso;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarCurso(CursoModificar curso) {
	    return jdbcTemplate.update("UPDATE curso SET titulo = ?, descripcion = ?, id_categoria = ?, id_usuario = ?, id_estado = ? WHERE id = ?",
	    		new Object[] { curso.getTitulo(), curso.getDescripcion(), curso.getIdCategoria(), curso.getIdUsuario(), curso.getIdEstado(), curso.getId()});
	  }

//	Estado
	@Override
	  public EstadoModificar findByIdEstado(Long id) {
	    try {
	    	EstadoModificar estado = jdbcTemplate.queryForObject("SELECT * FROM estado WHERE id=?",
	          BeanPropertyRowMapper.newInstance(EstadoModificar.class), id);
	      return estado;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarEstado(EstadoModificar estado) {
	    return jdbcTemplate.update("UPDATE estado SET descripcion = ?, observacion = ?, id_modulo = ? WHERE id = ?",
	    		new Object[] { estado.getDescripcion(), estado.getObservacion(), estado.getIdModulo(), estado.getId()});
	  }

//	Evaluacion Seccion Estudiante
	@Override
	  public EvaluacionSeccionEstudianteModificar findByIdEvaluacionSeccion(Long id) {
	    try {
	    	EvaluacionSeccionEstudianteModificar evaluacionSeccion = jdbcTemplate.queryForObject("SELECT * FROM evaluacion_seccion_estudiante WHERE id=?",
	          BeanPropertyRowMapper.newInstance(EvaluacionSeccionEstudianteModificar.class), id);
	      return evaluacionSeccion;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarEvaluacionSeccion(EvaluacionSeccionEstudianteModificar evaluacionSeccion) {
	    return jdbcTemplate.update("UPDATE evaluacion_seccion_estudiante SET id_pregunta_evaluacion = ?, id_respuesta_evaluacion = ?, id_usuario = ?, id_estado = ? WHERE id = ?",
	    		new Object[] { evaluacionSeccion.getIdPreguntaEvaluacion(), evaluacionSeccion.getIdRespuestaEvaluacion(), evaluacionSeccion.getIdUsuario(), evaluacionSeccion.getIdEstado(), evaluacionSeccion.getId()});
	  }

//	Modulo
	@Override
	  public ModuloModificar findByIdModulo(Long id) {
	    try {
	    	ModuloModificar modulo = jdbcTemplate.queryForObject("SELECT * FROM modulo WHERE id=?",
	          BeanPropertyRowMapper.newInstance(ModuloModificar.class), id);
	      return modulo;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarModulo(ModuloModificar modulo) {
	    return jdbcTemplate.update("UPDATE modulo SET descripcion = ? WHERE id = ?",
	    		new Object[] { modulo.getDescripcion(), modulo.getId()});
	  }

//	Pregunta Evaluacion
	@Override
	  public PreguntaEvaluacionModificar findByIdPreguntaEvaluacion(Long id) {
	    try {
	    	PreguntaEvaluacionModificar preguntaEvaluacion = jdbcTemplate.queryForObject("SELECT * FROM pregunta_evaluacion WHERE id=?",
	          BeanPropertyRowMapper.newInstance(PreguntaEvaluacionModificar.class), id);
	      return preguntaEvaluacion;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarPreguntaEvaluacion(PreguntaEvaluacionModificar preguntaEvaluacion) {
	    return jdbcTemplate.update("UPDATE pregunta_evaluacion SET descripcion = ?, id_estado = ?, id_tema_curso = ? WHERE id = ?",
	    		new Object[] { preguntaEvaluacion.getDescripcion(), preguntaEvaluacion.getIdEstado(), preguntaEvaluacion.getIdTemaCurso(), preguntaEvaluacion.getId()});
	  }

//	Respuesta Evaluacion
	@Override
	  public RespuestaEvaluacionModificar findByIdRespuestaEvaluacion(Long id) {
	    try {
	    	RespuestaEvaluacionModificar respuestaEvaluacion = jdbcTemplate.queryForObject("SELECT * FROM respuesta_evaluacion WHERE id=?",
	          BeanPropertyRowMapper.newInstance(RespuestaEvaluacionModificar.class), id);
	      return respuestaEvaluacion;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarRespuestaEvaluacion(RespuestaEvaluacionModificar respuestaEvaluacion) {
	    return jdbcTemplate.update("UPDATE respuesta_evaluacion SET descripcion = ?, id_pregunta_evaluacion = ?, correcta = ?, id_estado = ? WHERE id = ?",
	    		new Object[] { respuestaEvaluacion.getDescripcion(), respuestaEvaluacion.getIdPreguntaEvaluacion(), respuestaEvaluacion.isCorrecta(), respuestaEvaluacion.getIdEstado(), respuestaEvaluacion.getId()});
	  }

//	Rol
	@Override
	  public RolModificar findByIdRol(Long id) {
	    try {
	    	RolModificar rol = jdbcTemplate.queryForObject("SELECT * FROM rol WHERE id=?",
	          BeanPropertyRowMapper.newInstance(RolModificar.class), id);
	      return rol;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarRol(RolModificar rol) {
	    return jdbcTemplate.update("UPDATE rol SET descripcion = ?, id_estado = ? WHERE id = ?",
	    		new Object[] { rol.getDescripcion(), rol.getIdEstado(), rol.getId()});
	  }

//	Seccion Curso
	@Override
	  public SeccionCursoModificar findByIdSeccionCurso(Long id) {
	    try {
	    	SeccionCursoModificar seccionCurso = jdbcTemplate.queryForObject("SELECT * FROM seccion_curso WHERE id=?",
	          BeanPropertyRowMapper.newInstance(SeccionCursoModificar.class), id);
	      return seccionCurso;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarSeccionCurso(SeccionCursoModificar seccionCurso) {
	    return jdbcTemplate.update("UPDATE seccion_curso SET descripcion = ?, fase = ?, id_estado = ?, id_curso = ? WHERE id = ?",
	    		new Object[] { seccionCurso.getDescripcion(), seccionCurso.getFase(), seccionCurso.getIdEstado(), seccionCurso.getIdCurso(), seccionCurso.getId()});
	  }

//	Tipo Documento
	@Override
	  public TipoDocumentoModificar findByIdTipoDocumento(Long id) {
	    try {
	    	TipoDocumentoModificar tipoDocumento = jdbcTemplate.queryForObject("SELECT * FROM tipo_documento WHERE id=?",
	          BeanPropertyRowMapper.newInstance(TipoDocumentoModificar.class), id);
	      return tipoDocumento;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarTipoDocumento(TipoDocumentoModificar tipoDocumento) {
	    return jdbcTemplate.update("UPDATE tipo_documento SET descripcion = ?, id_estado = ? WHERE id = ?",
	    		new Object[] { tipoDocumento.getDescripcion(), tipoDocumento.getIdEstado(), tipoDocumento.getId()});
	  }

//	Usuario
	@Override
	  public UsuarioModificar findByIdUsuario(Long id) {
	    try {
	    	UsuarioModificar usuario = jdbcTemplate.queryForObject("SELECT * FROM usuario WHERE id=?",
	          BeanPropertyRowMapper.newInstance(UsuarioModificar.class), id);
	      return usuario;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarUsuario(UsuarioModificar usuario) {
	    return jdbcTemplate.update("UPDATE usuario SET nombre = ?, apellido = ?, correo = ?, documento = ?, password = ?, id_estado = ?, id_tipo_documento = ?, id_rol = ? WHERE id = ?",
	    		new Object[] { usuario.getNombre(), usuario.getApellido(), usuario.getCorreo(), usuario.getDocumento(), usuario.getPassword(), usuario.getIdEstado(), usuario.getIdTipoDocumento(), usuario.getIdRol(), usuario.getId()});
	  }
	
//	Temas Curso
	@Override
	  public TemaCursoModificar findByIdTemaCurso(Long id) {
	    try {
	    	TemaCursoModificar temaCurso = jdbcTemplate.queryForObject("SELECT * FROM tema_curso WHERE id=?",
	          BeanPropertyRowMapper.newInstance(TemaCursoModificar.class), id);
	      return temaCurso;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	}

	@Override
	  public int modificarTemasCurso(TemaCursoModificar temaCurso) {
	    return jdbcTemplate.update("UPDATE tema_curso SET descripcion = ?, id_estado = ?, id_seccion_curso = ?, evaluacion = ? WHERE id = ?",
	    		new Object[] { temaCurso.getDescripcion(), temaCurso.getIdEstado(), temaCurso.getIdSeccionCurso(), temaCurso.getEvaluacion(), temaCurso.getId()});
	  }
}

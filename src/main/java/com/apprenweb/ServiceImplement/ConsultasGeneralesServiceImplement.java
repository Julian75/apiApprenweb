package com.apprenweb.ServiceImplement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

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
import com.apprenweb.Service.IConsultasGeneralesService;

@Repository
public class ConsultasGeneralesServiceImplement implements IConsultasGeneralesService{

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public List<EstadoModificar> findByEstadoIdModulo(Long idModulo) {
		List<EstadoModificar> lista = new ArrayList<EstadoModificar>();
		try {
			String consultaId = "SELECT * FROM estado WHERE id_modulo = "+idModulo;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(EstadoModificar.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<RolesConsulta> findByRoles(Long opcion) {
		List<RolesConsulta> lista = new ArrayList<RolesConsulta>();
		try {
			if(opcion == 1) {
				//Activos
				String consultaId = "SELECT r.id, r.descripcion, e.id AS idEstado, e.descripcion AS estado FROM rol r INNER JOIN estado e ON e.id = r.id_estado WHERE r.id_estado = 4";
				lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(RolesConsulta.class));
				lista.stream().forEach(System.out::println);
			}else if(opcion == 2) {
				//Todos
				String consultaId = "SELECT r.id, r.descripcion, e.id AS idEstado, e.descripcion AS estado FROM rol r INNER JOIN estado e ON e.id = r.id_estado";
				lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(RolesConsulta.class));
				lista.stream().forEach(System.out::println);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<AccesoConsulta> findByAccesos() {
		List<AccesoConsulta> lista = new ArrayList<AccesoConsulta>();
		try {
			String consultaId = "SELECT a.id, r.id AS idRol, r.descripcion AS rol, m.id AS idModulo, m.descripcion AS modulo FROM accesos a INNER JOIN rol r ON r.id = a.id_rol INNER JOIN modulo m ON m.id = a.id_modulo";
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(AccesoConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<EstadoConsulta> findByEstados() {
		List<EstadoConsulta> lista = new ArrayList<EstadoConsulta>();
		try {
			String consultaId = "SELECT e.id, e.descripcion, e.observacion, m.id AS idModulo, m.descripcion AS modulo FROM estado e INNER JOIN modulo m ON m.id = e.id_modulo";
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(EstadoConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<TipoDocumentoConsulta> findByTipoDocumentosActivos() {
		List<TipoDocumentoConsulta> lista = new ArrayList<TipoDocumentoConsulta>();
		try {
			String consultaId = "SELECT td.id, td.descripcion, e.id AS idEstado, e.descripcion as estado FROM tipo_documento td INNER JOIN estado e ON e.id = td.id_estado WHERE td.id_estado = 2";
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(TipoDocumentoConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<CursoConsulta> findByMisCursos(int decision, Long idUsuario) {
		List<CursoConsulta> lista = new ArrayList<CursoConsulta>();
		try {
			String consultaId = "";
			if(decision == 1) {
				consultaId = "SELECT c.id AS idCurso, c.titulo, c.descripcion, cat.id AS idCategoria, cat.descripcion as categoria, u.id AS idUsuario, CONCAT(u.nombre, ' ', u.apellido) as usuario, e.id as idEstado, e.descripcion as estado, if(r.id = 1, 1, 2) as acceso FROM curso c INNER JOIN categoria cat ON cat.id = c.id_categoria INNER JOIN usuario u ON u.id = c.id_usuario INNER JOIN estado e ON e.id = c.id_estado INNER JOIN rol r ON r.id = u.id_rol";
			}else if(decision == 2) {
				consultaId = "SELECT c.id AS idCurso, c.titulo, c.descripcion, cat.id AS idCategoria, cat.descripcion as categoria, u.id AS idUsuario, CONCAT(u.nombre, ' ', u.apellido) as usuario, e.id as idEstado, e.descripcion as estado, if(r.id = 2, 1, 2) as acceso FROM curso c INNER JOIN categoria cat ON cat.id = c.id_categoria INNER JOIN usuario u ON u.id = c.id_usuario INNER JOIN estado e ON e.id = c.id_estado INNER JOIN rol r ON r.id = u.id_rol INNER JOIN curso_estudiante ce ON ce.id_curso = c.id WHERE ce.id_usuario = "+idUsuario;
			}else {
				consultaId = "SELECT c.id AS idCurso, c.titulo, c.descripcion, cat.id AS idCategoria, cat.descripcion as categoria, u.id AS idUsuario, CONCAT(u.nombre, ' ', u.apellido) as usuario, e.id as idEstado, e.descripcion as estado, if(r.id = 1, 1, 2) as acceso FROM curso c INNER JOIN categoria cat ON cat.id = c.id_categoria INNER JOIN usuario u ON u.id = c.id_usuario INNER JOIN estado e ON e.id = c.id_estado INNER JOIN rol r ON r.id = u.id_rol WHERE c.id_usuario = "+idUsuario;
			}
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(CursoConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<UsuarioModificar> findByUsuariosActivos() {
		List<UsuarioModificar> lista = new ArrayList<UsuarioModificar>();
		try {
			String consultaId = "SELECT * FROM usuario WHERE id_estado = 6";
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(UsuarioModificar.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<CategoriaModificar> findByCategoriasActivas() {
		List<CategoriaModificar> lista = new ArrayList<CategoriaModificar>();
		try {
			String consultaId = "SELECT * FROM categoria WHERE id_estado = 8";
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(CategoriaModificar.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<CursoConsulta> findBySeccionesCurso(Long idCurso) {
		List<CursoConsulta> lista = new ArrayList<CursoConsulta>();
		try {
			String consultaId = "SELECT sc.id as idSeccionCurso, sc.descripcion, sc.fase, sc.id_estado as idEstado, e.descripcion as estado, sc.id_curso, c.descripcion as curso, ca.id as idCategoria, ca.descripcion as categoria FROM `seccion_curso` sc INNER JOIN estado e ON e.id = sc.id_estado INNER JOIN curso c ON c.id = sc.id_curso INNER JOIN categoria ca ON ca.id = c.id_categoria WHERE sc.id_curso = "+idCurso;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(CursoConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<SeccionCursoModificar> findBySeccionCursoActivo(Long idCurso) {
		List<SeccionCursoModificar> lista = new ArrayList<SeccionCursoModificar>();
		try {
			String consultaId = "SELECT * FROM seccion_curso WHERE id_estado = 12 AND id_curso = "+idCurso;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(SeccionCursoModificar.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<CursoEstudianteConsulta> findByCursoEstudianteIdCurso(Long idCurso) {
		List<CursoEstudianteConsulta> lista = new ArrayList<CursoEstudianteConsulta>();
		try {
			String consultaId = "SELECT ce.id, ce.fecha, ce.id_curso, u.id AS idUsuario, CONCAT(u.nombre,' ',u.apellido) AS estudiante, e.id AS idEstado, e.descripcion AS estado FROM curso_estudiante ce INNER JOIN usuario u ON u.id = ce.id_usuario INNER JOIN estado e ON e.id = ce.id_estado WHERE ce.id_curso = "+idCurso;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(CursoEstudianteConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<PreguntaEvaluacionConsulta> findByPreguntasIdCurso(Long idCurso) {
		List<PreguntaEvaluacionConsulta> lista = new ArrayList<PreguntaEvaluacionConsulta>();
		try {
			String consultaId = "SELECT pe.id, pe.descripcion, sc.id AS idSeccionCurso, sc.descripcion AS seccionCurso, tc.id AS idTemaCurso, tc.descripcion AS temaCurso, e.id AS idEstado, e.descripcion AS estado FROM pregunta_evaluacion pe INNER JOIN tema_curso tc ON tc.id = pe.id_tema_curso INNER JOIN seccion_curso sc ON sc.id = tc.id_seccion_curso INNER JOIN estado e ON e.id = pe.id_estado WHERE sc.id_curso = "+idCurso;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(PreguntaEvaluacionConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<RespuestaEvaluacionConsulta> findByRespuestaIdPregunta(Long idPregunta) {
		List<RespuestaEvaluacionConsulta> lista = new ArrayList<RespuestaEvaluacionConsulta>();
		try {
			String consultaId = "SELECT re.id, re.descripcion, re.correcta, e.id AS idEstado, e.descripcion AS estado, re.id_pregunta_evaluacion AS idPreguntaEvaluacion FROM respuesta_evaluacion re INNER JOIN estado e ON e.id = re.id_estado WHERE re.id_pregunta_evaluacion = "+idPregunta;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(RespuestaEvaluacionConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<CursoConsulta> findByCursoRegistrado(String tituloCurso, Long idCategoriaCurso, String descripcion, Long idUsuario, Long idEstado) {
		List<CursoConsulta> lista = new ArrayList<CursoConsulta>();
		try {
			String consultaId = "SELECT c.id AS idCurso, c.titulo, c.descripcion, c.id_categoria AS idCategoria, c.id_estado AS idEstado, c.id_usuario AS idUsuario FROM `curso` c WHERE UPPER(c.titulo) = UPPER('"+tituloCurso+"') AND c.id_categoria = "+idCategoriaCurso+" AND UPPER(c.descripcion) = UPPER('"+descripcion+"') AND c.id_usuario = "+idUsuario+" AND c.id_estado = "+idEstado;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(CursoConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<ContenidoCursoConsulta> findByContenidoCursoIdCategoria(Long idCategoria, int opcion, Long idUsuario) {
		List<ContenidoCursoConsulta> lista = new ArrayList<ContenidoCursoConsulta>();
		try {
			String consultaId = "";
			if(opcion == 1) {
				consultaId = "SELECT c.id AS idCurso, c.descripcion, c.titulo, u.id AS idUsuario, CONCAT(u.nombre,' ',u.apellido) AS profesor, (SELECT GROUP_CONCAT(cc.descripcion_archivo,' ') AS descripcionArchivo FROM contenido_curso cc WHERE cc.id_curso = c.id AND cc.observacion LIKE '%PRINCIPAL%' AND cc.id_estado = 22 AND REPLACE(cc.observacion, 'PRINCIPAL', '') = (SELECT MAX(REPLACE(con.observacion, 'PRINCIPAL','')) FROM contenido_curso con WHERE con.id_estado = 22 AND con.id_curso = c.id AND con.observacion LIKE '%PRINCIPAL%')) AS descripcionArchivo FROM curso c INNER JOIN usuario u ON u.id = c.id_usuario WHERE c.id_estado = 10 AND c.id_categoria = "+idCategoria; 
			}else {
				consultaId = "SELECT DISTINCT c.titulo, c.descripcion, c.id as idCurso, c.id_usuario as idUsuario, CONCAT(u.nombre, ' ', u.apellido) as profesor, (SELECT (GROUP_CONCAT(cc.descripcion_archivo,'')) FROM contenido_curso cc WHERE cc.id_curso = c.id) as descripcionArchivo FROM curso_estudiante ce INNER JOIN curso c ON c.id = ce.id_curso INNER JOIN usuario u ON u.id = c.id_usuario WHERE c.id_estado = 10 AND ce.id_usuario = "+idUsuario;
			}
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(ContenidoCursoConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<ContenidoCursoConsulta> findByContenidoCursoIdCurso(Long idCurso) {
		List<ContenidoCursoConsulta> lista = new ArrayList<ContenidoCursoConsulta>();
		try {
			String consultaId = "SELECT c.id AS idCurso, c.titulo, c.descripcion, c.id_usuario, CONCAT(u.nombre,' ',u.apellido) AS profesor, cc.id AS idContenido, cc.descripcion_archivo, cc.observacion FROM contenido_curso cc INNER JOIN curso c ON c.id = cc.id_curso INNER JOIN usuario u ON u.id = c.id_usuario WHERE cc.observacion LIKE '%PRINCIPAL%' AND c.id_estado != 11 AND cc.id_curso = "+idCurso;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(ContenidoCursoConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<ContenidoCursoConsulta> findByTemaCursoContenido() {
		List<ContenidoCursoConsulta> lista = new ArrayList<ContenidoCursoConsulta>();
		try {
			String consultaId = "SELECT tc.id as idTemaCurso, cat.descripcion as categoria, c.titulo, c.descripcion as descripcion, sc.descripcion AS seccionCurso, tc.descripcion as temaCurso, CONCAT(u.nombre, ' ', u.apellido) AS profesor, e.descripcion AS estado, IF(ISNULL((SELECT cc.id FROM contenido_curso cc WHERE cc.id_tema_curso = tc.id LIMIT 1)),'FALSE', 'TRUE') as existeContenido, u.id as idUsuario FROM tema_curso tc INNER JOIN seccion_curso sc ON sc.id = tc.id_seccion_curso INNER JOIN curso c ON c.id = sc.id_curso INNER JOIN categoria cat ON cat.id = c.id_categoria INNER JOIN usuario u ON u.id = c.id_usuario INNER JOIN estado e ON e.id = sc.id_estado WHERE tc.id_seccion_curso AND tc.id_estado = 24";
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(ContenidoCursoConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<CursoEstudianteModificar> findByCursoEstudianteExistente(Long idUsuario, Long idCategoria) {
		List<CursoEstudianteModificar> lista = new ArrayList<CursoEstudianteModificar>();
		try {
			String consultaId = "SELECT ce.* FROM curso_estudiante ce INNER JOIN curso c ON c.id = ce.id_curso WHERE ce.id_estado != 21 AND ce.id_usuario = "+idUsuario+" AND c.id_categoria = "+idCategoria;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(CursoEstudianteModificar.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<TemaCursoModificar> findByTemaCursoActivo(Long idSeccion) {
		List<TemaCursoModificar> lista = new ArrayList<TemaCursoModificar>();
		try {
			String consultaId = "SELECT * FROM tema_curso WHERE id_estado = 24 AND id_seccion_curso = "+idSeccion;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(TemaCursoModificar.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<TemaCursoModificar> findByEvaluacionSeccionEstudiante(Long idCurso, Long idUsuario) {
		List<TemaCursoModificar> lista = new ArrayList<TemaCursoModificar>();
		try {
			String consultaId = "SELECT DISTINCT pe.id_tema_curso as id, pe.descripcion FROM evaluacion_seccion_estudiante evs INNER JOIN pregunta_evaluacion pe ON pe.id = evs.id_pregunta_evaluacion INNER JOIN tema_curso tc ON tc.id = pe.id_tema_curso INNER JOIN seccion_curso sc on sc.id = tc.id_seccion_curso WHERE evs.id_usuario = "+idUsuario+" AND sc.id_curso = "+idCurso;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(TemaCursoModificar.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<TemaCursoModificar> findByTemaCursoActivoidCurso(Long idCurso) {
		List<TemaCursoModificar> lista = new ArrayList<TemaCursoModificar>();
		try {
			String consultaId = "SELECT * FROM tema_curso tc INNER JOIN seccion_curso sc ON sc.id = tc.id_seccion_curso WHERE sc.id_curso = "+idCurso;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(TemaCursoModificar.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<PreguntaEvaluacionConsulta> findByPreguntasIdTemaCurso(Long idTemaCurso) {
		List<PreguntaEvaluacionConsulta> lista = new ArrayList<PreguntaEvaluacionConsulta>();
		try {
			String consultaId = "SELECT pe.id, pe.descripcion, pe.id_estado as idEstado, pe.id_tema_curso as idTemaCurso FROM pregunta_evaluacion pe WHERE pe.id_tema_curso = "+idTemaCurso;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(PreguntaEvaluacionConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<RespuestaEvaluacionConsulta> findByRespuestasIdTemaCurso(Long idTemaCurso) {
		List<RespuestaEvaluacionConsulta> lista = new ArrayList<RespuestaEvaluacionConsulta>();
		try {
			String consultaId = "SELECT re.id, re.descripcion, re.correcta, re.id_estado as idEstado, re.id_pregunta_evaluacion AS idPreguntaEvaluacion FROM `respuesta_evaluacion` re INNER JOIN pregunta_evaluacion pe ON pe.id = re.id_pregunta_evaluacion WHERE pe.id_tema_curso = "+idTemaCurso;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(RespuestaEvaluacionConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<CursoModificar> findByCursosIdCategoria(Long idCategoria) {
		List<CursoModificar> lista = new ArrayList<CursoModificar>();
		try {
			String consultaId = "SELECT * FROM curso WHERE id_estado = 10 AND id_categoria = "+idCategoria;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(CursoModificar.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<PreguntaEvaluacionConsulta> findByTemasEvaluacionCurso(Long idCurso, Long idUsuario) {
		List<PreguntaEvaluacionConsulta> lista = new ArrayList<PreguntaEvaluacionConsulta>();
		try {
			String consultaId = "SELECT DISTINCT (SELECT GROUP_CONCAT(DISTINCT pe.id) FROM `pregunta_evaluacion` pe inner JOIN tema_curso tc ON tc.id = pe.id_tema_curso INNER JOIN seccion_curso sc ON sc.id = tc.id_seccion_curso WHERE sc.id_curso = "+idCurso+") AS evaluacionesInstructor, (SELECT GROUP_CONCAT(DISTINCT IF((SELECT COUNT(pee.id) FROM pregunta_evaluacion pee WHERE pee.id_tema_curso = tc.id) = (SELECT COUNT(peval.id) FROM evaluacion_seccion_estudiante evas INNER JOIN pregunta_evaluacion peval ON peval.id = evas.id_pregunta_evaluacion WHERE evas.id_estado = 27 AND peval.id_tema_curso = tc.id), pe.id, '')) AS evaluacionEstudiante FROM evaluacion_seccion_estudiante ev INNER JOIN pregunta_evaluacion pe ON pe.id = ev.id_pregunta_evaluacion INNER JOIN tema_curso tc ON tc.id = pe.id_tema_curso INNER JOIN seccion_curso secc ON secc.id = tc.id_seccion_curso WHERE ev.id_usuario = "+idUsuario+" AND secc.id_curso = "+idCurso+") AS evaluacionEstudiante FROM tema_curso";
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(PreguntaEvaluacionConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<ContenidoCursoConsulta> findByContenidoCursoIdTema(Long idTema) {
		List<ContenidoCursoConsulta> lista = new ArrayList<ContenidoCursoConsulta>();
		try {
			String consultaId = "SELECT c.id AS idCurso, c.titulo, c.descripcion, c.id_usuario, CONCAT(u.nombre,' ',u.apellido) AS profesor, cc.id AS idContenido, cc.descripcion_archivo, cc.observacion, cc.id_tema_curso AS idTemaCurso FROM contenido_curso cc INNER JOIN curso c ON c.id = cc.id_curso INNER JOIN usuario u ON u.id = c.id_usuario WHERE cc.observacion LIKE '%CONTENIDO TEMA CURSO%' AND c.id_estado != 11 AND cc.id_tema_curso = "+idTema;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(ContenidoCursoConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<EvaluacionSeccionEstudianteModificar> findByEvaluacionesResueltasUsuTema(Long idUsuario, Long idTema) {
		List<EvaluacionSeccionEstudianteModificar> lista = new ArrayList<EvaluacionSeccionEstudianteModificar>();
		try {
			String consultaId = "SELECT es.* FROM evaluacion_seccion_estudiante es INNER JOIN pregunta_evaluacion pe ON pe.id = es.id_pregunta_evaluacion WHERE es.id_estado = 27 AND pe.id_tema_curso = "+idTema+" AND es.id_usuario = "+idUsuario;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(EvaluacionSeccionEstudianteModificar.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<EvaluacionesResueltasConsulta> findByTemasEvaluacionEstudiante(Long idUsuario) {
		List<EvaluacionesResueltasConsulta> lista = new ArrayList<EvaluacionesResueltasConsulta>();
		try {
			String consultaId = "SELECT DISTINCT pe.id_tema_curso, tc.descripcion AS temaCurso, sc.id AS idSeccionCurso, sc.descripcion AS seccionCurso, c.id AS idCurso, c.descripcion AS descripcionCurso, c.titulo AS tituloCurso, cat.descripcion AS categoria FROM evaluacion_seccion_estudiante es INNER JOIN pregunta_evaluacion pe ON pe.id = es.id_pregunta_evaluacion INNER JOIN tema_curso tc ON tc.id = pe.id_tema_curso INNER JOIN seccion_curso sc ON sc.id = pe.id_tema_curso INNER JOIN curso c ON c.id = sc.id_curso INNER JOIN categoria cat ON cat.id = c.id_categoria WHERE es.id_estado = 27 AND es.id_usuario = "+idUsuario+" ORDER BY pe.id_tema_curso";
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(EvaluacionesResueltasConsulta.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<PreguntaEvaluacionModificar> findByPreguntasIdTema(Long idTema) {
		List<PreguntaEvaluacionModificar> lista = new ArrayList<PreguntaEvaluacionModificar>();
		try {
			String consultaId = "SELECT pe.*, re.id AS idRespuesta FROM respuesta_evaluacion re INNER JOIN pregunta_evaluacion pe ON pe.id = re.id_pregunta_evaluacion WHERE re.id_estado = 19 AND correcta = 1 AND pe.id_estado = 17 AND pe.id_tema_curso = "+idTema;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(PreguntaEvaluacionModificar.class));
			lista.stream().forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
}

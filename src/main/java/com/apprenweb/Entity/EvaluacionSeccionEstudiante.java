package com.apprenweb.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "evaluacion_seccion_estudiante")
public class EvaluacionSeccionEstudiante implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_pregunta_evaluacion", nullable = false)
	private PreguntaEvaluacion idPreguntaEvaluacion;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_respuesta_evaluacion", nullable = false)
	private RespuestaEvaluacion idRespuestaEvaluacion;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario idUsuario;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_estado", nullable = false)
	private Estado idEstado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PreguntaEvaluacion getIdPreguntaEvaluacion() {
		return idPreguntaEvaluacion;
	}

	public void setIdPreguntaEvaluacion(PreguntaEvaluacion idPreguntaEvaluacion) {
		this.idPreguntaEvaluacion = idPreguntaEvaluacion;
	}

	public RespuestaEvaluacion getIdRespuestaEvaluacion() {
		return idRespuestaEvaluacion;
	}

	public void setIdRespuestaEvaluacion(RespuestaEvaluacion idRespuestaEvaluacion) {
		this.idRespuestaEvaluacion = idRespuestaEvaluacion;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Estado getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Estado idEstado) {
		this.idEstado = idEstado;
	}
	
}

package com.apprenweb.EntityModifica;

public class EvaluacionSeccionEstudianteModificar {

	Long id;
	Long idPreguntaEvaluacion;
	Long idRespuestaEvaluacion;
	Long idUsuario;
	Long idEstado;
	
	public EvaluacionSeccionEstudianteModificar() {
		super();
	}

	public EvaluacionSeccionEstudianteModificar(Long id, Long idPreguntaEvaluacion, Long idRespuestaEvaluacion,
			Long idUsuario, Long idEstado) {
		super();
		this.id = id;
		this.idPreguntaEvaluacion = idPreguntaEvaluacion;
		this.idRespuestaEvaluacion = idRespuestaEvaluacion;
		this.idUsuario = idUsuario;
		this.idEstado = idEstado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdPreguntaEvaluacion() {
		return idPreguntaEvaluacion;
	}

	public void setIdPreguntaEvaluacion(Long idPreguntaEvaluacion) {
		this.idPreguntaEvaluacion = idPreguntaEvaluacion;
	}

	public Long getIdRespuestaEvaluacion() {
		return idRespuestaEvaluacion;
	}

	public void setIdRespuestaEvaluacion(Long idRespuestaEvaluacion) {
		this.idRespuestaEvaluacion = idRespuestaEvaluacion;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	
}

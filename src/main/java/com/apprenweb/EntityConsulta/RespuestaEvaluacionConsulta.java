package com.apprenweb.EntityConsulta;

public class RespuestaEvaluacionConsulta {

	Long id;
	String descripcion;
	boolean correcta;
	Long idEstado;
	String estado;
	Long idPreguntaEvaluacion;
	
	public RespuestaEvaluacionConsulta() {
		super();
	}

	public RespuestaEvaluacionConsulta(Long id, String descripcion, boolean correcta, Long idEstado, String estado,
			Long idPreguntaEvaluacion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.correcta = correcta;
		this.idEstado = idEstado;
		this.estado = estado;
		this.idPreguntaEvaluacion = idPreguntaEvaluacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isCorrecta() {
		return correcta;
	}

	public void setCorrecta(boolean correcta) {
		this.correcta = correcta;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getIdPreguntaEvaluacion() {
		return idPreguntaEvaluacion;
	}

	public void setIdPreguntaEvaluacion(Long idPreguntaEvaluacion) {
		this.idPreguntaEvaluacion = idPreguntaEvaluacion;
	}
	
}

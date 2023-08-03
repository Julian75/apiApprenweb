package com.apprenweb.EntityModifica;

public class RespuestaEvaluacionModificar {

	Long id;
	String descripcion;
	Long idPreguntaEvaluacion;
	boolean correcta;
	Long idEstado;
	
	public RespuestaEvaluacionModificar() {
		super();
	}

	public RespuestaEvaluacionModificar(Long id, String descripcion, Long idPreguntaEvaluacion, boolean correcta,
			Long idEstado) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.idPreguntaEvaluacion = idPreguntaEvaluacion;
		this.correcta = correcta;
		this.idEstado = idEstado;
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

	public Long getIdPreguntaEvaluacion() {
		return idPreguntaEvaluacion;
	}

	public void setIdPreguntaEvaluacion(Long idPreguntaEvaluacion) {
		this.idPreguntaEvaluacion = idPreguntaEvaluacion;
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
	
}

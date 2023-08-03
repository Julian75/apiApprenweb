package com.apprenweb.EntityModifica;

public class PreguntaEvaluacionModificar {

	Long id;
	String descripcion;
	Long idEstado;
	Long idTemaCurso;
	
	public PreguntaEvaluacionModificar() {
		super();
	}

	public PreguntaEvaluacionModificar(Long id, String descripcion, Long idEstado, Long idTemaCurso) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.idEstado = idEstado;
		this.idTemaCurso = idTemaCurso;
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

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public Long getIdTemaCurso() {
		return idTemaCurso;
	}

	public void setIdTemaCurso(Long idTemaCurso) {
		this.idTemaCurso = idTemaCurso;
	}

}

package com.apprenweb.EntityModifica;

public class TemaCursoModificar {

	Long id;
	String descripcion;
	String evaluacion;
	Long idEstado;
	Long idSeccionCurso;
	
	public TemaCursoModificar() {
		super();
	}

	public TemaCursoModificar(Long id, String descripcion, String evaluacion, Long idEstado, Long idSeccionCurso) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.evaluacion = evaluacion;
		this.idEstado = idEstado;
		this.idSeccionCurso = idSeccionCurso;
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

	public Long getIdSeccionCurso() {
		return idSeccionCurso;
	}

	public void setIdSeccionCurso(Long idSeccionCurso) {
		this.idSeccionCurso = idSeccionCurso;
	}

	public String getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(String evaluacion) {
		this.evaluacion = evaluacion;
	}
	
}

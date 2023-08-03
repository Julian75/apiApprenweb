package com.apprenweb.EntityConsulta;

public class PreguntaEvaluacionConsulta {

	Long id;
	String descripcion;
	Long idSeccionCurso;
	String seccionCurso;
	Long idTemaCurso;
	String temaCurso;
	Long idEstado;
	String estado;
	String evaluacionesInstructor;
	String evaluacionEstudiante;
	
	public PreguntaEvaluacionConsulta() {
		super();
	}

	public PreguntaEvaluacionConsulta(Long id, String descripcion, Long idSeccionCurso, String seccionCurso,
			Long idTemaCurso, String temaCurso, Long idEstado, String estado, String evaluacionesInstructor,
			String evaluacionEstudiante) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.idSeccionCurso = idSeccionCurso;
		this.seccionCurso = seccionCurso;
		this.idTemaCurso = idTemaCurso;
		this.temaCurso = temaCurso;
		this.idEstado = idEstado;
		this.estado = estado;
		this.evaluacionesInstructor = evaluacionesInstructor;
		this.evaluacionEstudiante = evaluacionEstudiante;
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

	public Long getIdSeccionCurso() {
		return idSeccionCurso;
	}

	public void setIdSeccionCurso(Long idSeccionCurso) {
		this.idSeccionCurso = idSeccionCurso;
	}

	public String getSeccionCurso() {
		return seccionCurso;
	}

	public void setSeccionCurso(String seccionCurso) {
		this.seccionCurso = seccionCurso;
	}

	public Long getIdTemaCurso() {
		return idTemaCurso;
	}

	public void setIdTemaCurso(Long idTemaCurso) {
		this.idTemaCurso = idTemaCurso;
	}

	public String getTemaCurso() {
		return temaCurso;
	}

	public void setTemaCurso(String temaCurso) {
		this.temaCurso = temaCurso;
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

	public String getEvaluacionesInstructor() {
		return evaluacionesInstructor;
	}

	public void setEvaluacionesInstructor(String evaluacionesInstructor) {
		this.evaluacionesInstructor = evaluacionesInstructor;
	}

	public String getEvaluacionEstudiante() {
		return evaluacionEstudiante;
	}

	public void setEvaluacionEstudiante(String evaluacionEstudiante) {
		this.evaluacionEstudiante = evaluacionEstudiante;
	}
	
}

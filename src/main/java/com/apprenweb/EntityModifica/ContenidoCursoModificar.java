package com.apprenweb.EntityModifica;

public class ContenidoCursoModificar {

	Long id;
	String descripcionArchivo;
	Long idTemaCurso;
	Long idCurso;
	Long idEstado;
	String observacion;
	
	public ContenidoCursoModificar() {
		super();
	}

	public ContenidoCursoModificar(Long id, String descripcionArchivo, Long idTemaCurso, Long idCurso, Long idEstado,
			String observacion) {
		super();
		this.id = id;
		this.descripcionArchivo = descripcionArchivo;
		this.idTemaCurso = idTemaCurso;
		this.idCurso = idCurso;
		this.idEstado = idEstado;
		this.observacion = observacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcionArchivo() {
		return descripcionArchivo;
	}

	public void setDescripcionArchivo(String descripcionArchivo) {
		this.descripcionArchivo = descripcionArchivo;
	}

	public Long getIdTemaCurso() {
		return idTemaCurso;
	}

	public void setIdTemaCurso(Long idTemaCurso) {
		this.idTemaCurso = idTemaCurso;
	}

	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
}

package com.apprenweb.EntityConsulta;

public class ContenidoCursoConsulta {

	Long idCurso;
	String titulo;
	String descripcion;
	Long idUsuario;
	String profesor;
	Long idContenido;
	String descripcionArchivo;
	String observacion;
	Long idTemaCurso;
	String categoria;
	String seccionCurso;
	String temaCurso;
	String estado;
	String existeContenido;
	
	public ContenidoCursoConsulta() {
		super();
	}

	public ContenidoCursoConsulta(Long idCurso, String titulo, String descripcion, Long idUsuario, String profesor,
			Long idContenido, String descripcionArchivo, String observacion, Long idTemaCurso, String categoria,
			String seccionCurso, String temaCurso, String estado, String existeContenido) {
		super();
		this.idCurso = idCurso;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.idUsuario = idUsuario;
		this.profesor = profesor;
		this.idContenido = idContenido;
		this.descripcionArchivo = descripcionArchivo;
		this.observacion = observacion;
		this.idTemaCurso = idTemaCurso;
		this.categoria = categoria;
		this.seccionCurso = seccionCurso;
		this.temaCurso = temaCurso;
		this.estado = estado;
		this.existeContenido = existeContenido;
	}

	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public Long getIdContenido() {
		return idContenido;
	}

	public void setIdContenido(Long idContenido) {
		this.idContenido = idContenido;
	}

	public String getDescripcionArchivo() {
		return descripcionArchivo;
	}

	public void setDescripcionArchivo(String descripcionArchivo) {
		this.descripcionArchivo = descripcionArchivo;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Long getIdTemaCurso() {
		return idTemaCurso;
	}

	public void setIdTemaCurso(Long idTemaCurso) {
		this.idTemaCurso = idTemaCurso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSeccionCurso() {
		return seccionCurso;
	}

	public void setSeccionCurso(String seccionCurso) {
		this.seccionCurso = seccionCurso;
	}

	public String getTemaCurso() {
		return temaCurso;
	}

	public void setTemaCurso(String temaCurso) {
		this.temaCurso = temaCurso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getExisteContenido() {
		return existeContenido;
	}

	public void setExisteContenido(String existeContenido) {
		this.existeContenido = existeContenido;
	}

}

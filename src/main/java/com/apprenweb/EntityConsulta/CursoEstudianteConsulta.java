package com.apprenweb.EntityConsulta;

public class CursoEstudianteConsulta {

	Long id;
	String fecha;
	Long idCurso;
	Long idUsuario;
	String estudiante;
	Long idEstado;
	String estado;
	
	public CursoEstudianteConsulta() {
		super();
	}

	public CursoEstudianteConsulta(Long id, String fecha, Long idCurso, Long idUsuario, String estudiante,
			Long idEstado, String estado) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.idCurso = idCurso;
		this.idUsuario = idUsuario;
		this.estudiante = estudiante;
		this.idEstado = idEstado;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
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
	
}

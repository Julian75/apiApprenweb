package com.apprenweb.EntityModifica;

public class CursoEstudianteModificar {
	
	Long id;
	Long idUsuario;
	Long idCurso;
	Long idEstado;
	String fecha;
	
	public CursoEstudianteModificar() {
		super();
	}

	public CursoEstudianteModificar(Long id, Long idUsuario, Long idCurso, Long idEstado, String fecha) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.idCurso = idCurso;
		this.idEstado = idEstado;
		this.fecha = fecha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}

package com.apprenweb.EntityModifica;

public class SeccionCursoModificar {

	Long id;
	String descripcion;
	int fase;
	Long idEstado;
	Long idCurso;
	
	public SeccionCursoModificar() {
		super();
	}

	public SeccionCursoModificar(Long id, String descripcion, int fase, Long idEstado, Long idCurso) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.fase = fase;
		this.idEstado = idEstado;
		this.idCurso = idCurso;
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

	public int getFase() {
		return fase;
	}

	public void setFase(int fase) {
		this.fase = fase;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}
	
}

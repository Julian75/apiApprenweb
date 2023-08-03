package com.apprenweb.EntityConsulta;

public class RolesConsulta {

	Long id;
	String descripcion;
	Long idEstado;
	String estado;
	
	public RolesConsulta() {
		super();
	}

	public RolesConsulta(Long id, String descripcion, Long idEstado, String estado) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.idEstado = idEstado;
		this.estado = estado;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}

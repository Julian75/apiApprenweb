package com.apprenweb.EntityModifica;

public class EstadoModificar {

	Long id;
	String descripcion;
	String observacion;
	Long idModulo;
	
	public EstadoModificar() {
		super();
	}

	public EstadoModificar(Long id, String descripcion, String observacion, Long idModulo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.observacion = observacion;
		this.idModulo = idModulo;
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

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Long getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(Long idModulo) {
		this.idModulo = idModulo;
	}
	
}

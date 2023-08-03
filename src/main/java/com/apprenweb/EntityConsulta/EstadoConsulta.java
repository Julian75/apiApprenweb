package com.apprenweb.EntityConsulta;

public class EstadoConsulta {

	Long id;
	String descripcion;
	String observacion;
	Long idModulo;
	String modulo;
	
	public EstadoConsulta() {
		super();
	}

	public EstadoConsulta(Long id, String descripcion, String observacion, Long idModulo, String modulo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.observacion = observacion;
		this.idModulo = idModulo;
		this.modulo = modulo;
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

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	
}

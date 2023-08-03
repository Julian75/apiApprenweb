package com.apprenweb.EntityConsulta;

public class AccesoConsulta {

	Long id;
	Long idRol;
	String rol;
	Long idModulo;
	String modulo;
	
	public AccesoConsulta() {
		super();
	}

	public AccesoConsulta(Long id, Long idRol, String rol, Long idModulo, String modulo) {
		super();
		this.id = id;
		this.idRol = idRol;
		this.rol = rol;
		this.idModulo = idModulo;
		this.modulo = modulo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
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

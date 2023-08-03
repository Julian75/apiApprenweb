package com.apprenweb.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descripcion", length = 30, nullable = false)
	private String descripcion;
	
	@Column(name = "observacion", length = 100)
	private String observacion;


	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_modulo", nullable = false)
	private Modulo idModulo;


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


	public Modulo getIdModulo() {
		return idModulo;
	}


	public void setIdModulo(Modulo idModulo) {
		this.idModulo = idModulo;
	}
	
}

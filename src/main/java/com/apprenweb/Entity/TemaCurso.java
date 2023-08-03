package com.apprenweb.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tema_curso")
public class TemaCurso implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "descripcion", columnDefinition = "LONGTEXT", nullable = false)
	private String descripcion;

	@Column(name = "evaluacion", nullable = false)
	private String evaluacion;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_estado", nullable = false)
	private Estado idEstado;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_seccion_curso", nullable = false)
	private SeccionCurso idSeccionCurso;

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

	public Estado getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Estado idEstado) {
		this.idEstado = idEstado;
	}

	public SeccionCurso getIdSeccionCurso() {
		return idSeccionCurso;
	}

	public void setIdSeccionCurso(SeccionCurso idSeccionCurso) {
		this.idSeccionCurso = idSeccionCurso;
	}

	public String getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(String evaluacion) {
		this.evaluacion = evaluacion;
	}
	
}

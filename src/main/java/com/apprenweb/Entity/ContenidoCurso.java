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
@Table(name = "contenido_curso")
public class ContenidoCurso implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "descripcion_archivo", columnDefinition = "LONGTEXT", nullable = false)
	private String descripcionArchivo;

	@Column(name = "observacion", columnDefinition = "LONGTEXT", nullable = false)
	private String observacion;
	
	@Column(name = "id_tema_curso", nullable = false)
	private Long idTemaCurso;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_curso", nullable = false)
	private Curso idCurso;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_estado", nullable = false)
	private Estado idEstado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Curso getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Curso idCurso) {
		this.idCurso = idCurso;
	}

	public Estado getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Estado idEstado) {
		this.idEstado = idEstado;
	}

}

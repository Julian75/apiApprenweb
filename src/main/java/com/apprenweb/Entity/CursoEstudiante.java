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
@Table(name = "curso_estudiante")
public class CursoEstudiante implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "fecha", columnDefinition = "LONGTEXT", nullable = false)
	private String fecha;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario idUsuario;

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

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}

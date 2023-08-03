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
@Table(name = "respuesta_evaluacion")
public class RespuestaEvaluacion implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "descripcion", columnDefinition = "LONGTEXT", nullable = false)
	private String descripcion;

	@Column(name = "correcta", nullable = false)
	private boolean correcta;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_pregunta_evaluacion", nullable = false)
	private PreguntaEvaluacion idPreguntaEvaluacion;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_estado", nullable = false)
	private Estado idEstado;

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

	public boolean isCorrecta() {
		return correcta;
	}

	public void setCorrecta(boolean correcta) {
		this.correcta = correcta;
	}

	public PreguntaEvaluacion getIdPreguntaEvaluacion() {
		return idPreguntaEvaluacion;
	}

	public void setIdPreguntaEvaluacion(PreguntaEvaluacion idPreguntaEvaluacion) {
		this.idPreguntaEvaluacion = idPreguntaEvaluacion;
	}

	public Estado getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Estado idEstado) {
		this.idEstado = idEstado;
	}
	
}

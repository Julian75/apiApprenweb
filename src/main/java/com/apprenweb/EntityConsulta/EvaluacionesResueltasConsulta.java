package com.apprenweb.EntityConsulta;

public class EvaluacionesResueltasConsulta {

	Long idTemaCurso;
	String temaCurso;
	Long idSeccionCurso;
	String seccionCurso;
	Long idCurso;
	String descripcionCurso;
	String tituloCurso;
	String categoria;
	
	public EvaluacionesResueltasConsulta() {
		super();
	}

	public EvaluacionesResueltasConsulta(Long idTemaCurso, String temaCurso, Long idSeccionCurso, String seccionCurso,
			Long idCurso, String descripcionCurso, String tituloCurso, String categoria) {
		super();
		this.idTemaCurso = idTemaCurso;
		this.temaCurso = temaCurso;
		this.idSeccionCurso = idSeccionCurso;
		this.seccionCurso = seccionCurso;
		this.idCurso = idCurso;
		this.descripcionCurso = descripcionCurso;
		this.tituloCurso = tituloCurso;
		this.categoria = categoria;
	}

	public Long getIdTemaCurso() {
		return idTemaCurso;
	}

	public void setIdTemaCurso(Long idTemaCurso) {
		this.idTemaCurso = idTemaCurso;
	}

	public String getTemaCurso() {
		return temaCurso;
	}

	public void setTemaCurso(String temaCurso) {
		this.temaCurso = temaCurso;
	}

	public Long getIdSeccionCurso() {
		return idSeccionCurso;
	}

	public void setIdSeccionCurso(Long idSeccionCurso) {
		this.idSeccionCurso = idSeccionCurso;
	}

	public String getSeccionCurso() {
		return seccionCurso;
	}

	public void setSeccionCurso(String seccionCurso) {
		this.seccionCurso = seccionCurso;
	}

	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	public String getDescripcionCurso() {
		return descripcionCurso;
	}

	public void setDescripcionCurso(String descripcionCurso) {
		this.descripcionCurso = descripcionCurso;
	}

	public String getTituloCurso() {
		return tituloCurso;
	}

	public void setTituloCurso(String tituloCurso) {
		this.tituloCurso = tituloCurso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}

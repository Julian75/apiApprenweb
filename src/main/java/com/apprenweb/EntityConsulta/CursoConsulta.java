package com.apprenweb.EntityConsulta;

public class CursoConsulta {
	
	Long idCurso;
	String titulo;
	String descripcion;
	Long idCategoria;
	String categoria;
	Long idUsuario;
	String usuario;
	Long idEstado;
	String estado;
	Long acceso;
	int fase;
	String curso;
	Long idSeccionCurso;
	
	public CursoConsulta() {
		super();
	}

	public CursoConsulta(Long idCurso, String titulo, String descripcion, Long idCategoria, String categoria,
			Long idUsuario, String usuario, Long idEstado, String estado, Long acceso, int fase, String curso,
			Long idSeccionCurso) {
		super();
		this.idCurso = idCurso;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.idCategoria = idCategoria;
		this.categoria = categoria;
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.idEstado = idEstado;
		this.estado = estado;
		this.acceso = acceso;
		this.fase = fase;
		this.curso = curso;
		this.idSeccionCurso = idSeccionCurso;
	}

	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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

	public Long getAcceso() {
		return acceso;
	}

	public void setAcceso(Long acceso) {
		this.acceso = acceso;
	}

	public int getFase() {
		return fase;
	}

	public void setFase(int fase) {
		this.fase = fase;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Long getIdSeccionCurso() {
		return idSeccionCurso;
	}

	public void setIdSeccionCurso(Long idSeccionCurso) {
		this.idSeccionCurso = idSeccionCurso;
	}

}

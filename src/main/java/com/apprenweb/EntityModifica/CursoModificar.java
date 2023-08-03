package com.apprenweb.EntityModifica;

public class CursoModificar {

	Long id;
	String titulo;
	String descripcion;
	Long idCategoria;
	Long idUsuario;
	Long idEstado;
	
	public CursoModificar() {
		super();
	}

	public CursoModificar(Long id, String titulo, String descripcion, Long idCategoria, Long idUsuario, Long idEstado) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.idCategoria = idCategoria;
		this.idUsuario = idUsuario;
		this.idEstado = idEstado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	
}

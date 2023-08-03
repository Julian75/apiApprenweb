package com.apprenweb.Service;

import java.util.List;
import java.util.Optional;

import com.apprenweb.Entity.Usuario;


public interface IUsuarioService {
	
	public List<Usuario> all();
	
	public Optional<Usuario> findById(Long id);
	
	public Usuario save(Usuario usuario);
	
	public void delete(Long id);
}


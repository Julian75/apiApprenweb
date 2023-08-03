package com.apprenweb.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apprenweb.Entity.Usuario;
import com.apprenweb.Repository.IUsuarioRepository;
import com.apprenweb.Service.IUsuarioService;

@Service
public class UsuarioServiceImplement implements IUsuarioService{
	
	@Autowired
	private IUsuarioRepository repository;
	        
	
	@Override
	public List<Usuario> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<Usuario> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public Usuario save(Usuario usuario) {
		return this.repository.save(usuario);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}

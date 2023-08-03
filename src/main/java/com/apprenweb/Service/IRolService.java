package com.apprenweb.Service;

import java.util.List;
import java.util.Optional;

import com.apprenweb.Entity.Rol;


public interface IRolService {
	
	public List<Rol> all();
	
	public Optional<Rol> findById(Long id);
	
	public Rol save(Rol rol);
	
	public void delete(Long id);

}

package com.apprenweb.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apprenweb.Entity.TipoDocumento;
import com.apprenweb.Repository.ITipoDocumentoRepository;
import com.apprenweb.Service.ITipoDocumentoService;


@Service
public class TipoDocumentoServiceImplement implements ITipoDocumentoService{
	
	@Autowired
	private ITipoDocumentoRepository repository;
	        
	
	@Override
	public List<TipoDocumento> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<TipoDocumento> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public TipoDocumento save(TipoDocumento tipoDocumento) {
		return this.repository.save(tipoDocumento);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}

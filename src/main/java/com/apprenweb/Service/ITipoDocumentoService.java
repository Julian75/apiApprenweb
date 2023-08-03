package com.apprenweb.Service;

import java.util.List;
import java.util.Optional;

import com.apprenweb.Entity.TipoDocumento;

public interface ITipoDocumentoService {
	
public List<TipoDocumento> all();
	
	public Optional<TipoDocumento> findById(Long id);
	
	public TipoDocumento save(TipoDocumento tipoDocumento);
	
	public void delete(Long id);
}

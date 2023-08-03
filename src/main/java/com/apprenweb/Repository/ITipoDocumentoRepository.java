package com.apprenweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apprenweb.Entity.TipoDocumento;


public interface ITipoDocumentoRepository extends JpaRepository<TipoDocumento, Long>{

}
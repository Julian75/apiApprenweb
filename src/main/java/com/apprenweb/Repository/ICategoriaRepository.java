package com.apprenweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apprenweb.Entity.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Long>{

}

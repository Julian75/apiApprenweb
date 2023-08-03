package com.apprenweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apprenweb.Entity.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}
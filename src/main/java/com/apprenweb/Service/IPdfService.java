package com.apprenweb.Service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public interface IPdfService {

    /* Metodo para crear la carpeta donde vamos a guardar los archivos */
	// public void init();

    /* Metodo para guardar los archivos */
    public void guardarContenidoCursoList(MultipartFile file) throws Exception;
    public void guardarContenidoCursoList(List<MultipartFile> files) throws Exception; //Contenido Curso

    /*
    Metodo para cargar un archivo
     */
    public Resource listarUnaContenidoCurso(String filename);

    /*
    Metodo para Cargar todos los archivos
     */
    public Stream<Path> listarTodoContenidoCurso();

    /*
    Metodo para Borrar un archivo
     */
    public String eliminarContenidoCurso(String filename);
    
}
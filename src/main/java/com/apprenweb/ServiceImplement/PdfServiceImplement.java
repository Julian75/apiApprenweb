package com.apprenweb.ServiceImplement;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import com.apprenweb.Service.IPdfService;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

@Service
public class PdfServiceImplement implements IPdfService{
	
	//Nombre de la carpeta donde vamos a almacenar los archivos
    //Se crea a nivel de raiz la carpeta
	
//	private final Path imagenesContenidoCurso = Paths.get("C:\\xampp\\htdocs\\apprenweb\\assets\\contenido-curso");
	
	//Para cuando sea Local
//	
	private final Path imagenesContenidoCurso = Paths.get("C:\\Users\\PROGRAMADOR\\Apprenweb\\src\\assets\\contenido-curso");
	
//    @Override
	
//    public void init() {
//        try {
//            Files.createDirectory(root);
//        } catch (IOException e) {
//            throw new RuntimeException("No se puede inicializar la carpeta uploads");
//        }
//    }
//    
//    public void deleteAll() {
//	}
	
	//----------------------- Contenido Curso Carpeta - Primera --------------------------------
	
	@Override
	public void guardarContenidoCursoList(MultipartFile file) throws Exception {
		Files.copy(file.getInputStream(), this.imagenesContenidoCurso.resolve(file.getOriginalFilename()));//nombre
	}
    
    @Override
	public void guardarContenidoCursoList(List<MultipartFile> files) throws Exception {
		for (MultipartFile file : files) {
			this.guardarContenidoCursoList(file);
		}
	}

	@Override
	public Resource listarUnaContenidoCurso(String filename) {
	    try {
	        Path file = imagenesContenidoCurso.resolve(filename);//nombre
	        Resource resource = new UrlResource(file.toUri());
	
	        if(resource.exists() || resource.isReadable()){
	            return resource;
	        }else{
	            throw new RuntimeException("No se puede leer el archivo ");
	        }	

	    }catch (MalformedURLException e){
	        throw new RuntimeException("Error: " + e.getMessage());
	    }
	}
	
	@Override
	public Stream<Path> listarTodoContenidoCurso(){
	    //Files.walk recorre nuestras carpetas (uploads) buscando los archivos
	    // el 1 es la profundidad o nivel que queremos recorrer
	    // :: Referencias a metodos
	    // Relativize sirve para crear una ruta relativa entre la ruta dada y esta ruta
	    try{
	        return Files.walk(this.imagenesContenidoCurso,1).filter(path -> !path.equals(this.imagenesContenidoCurso))//nombre
	                .map(this.imagenesContenidoCurso::relativize);//nombre
	    }catch (RuntimeException | IOException e){
	        throw new RuntimeException("No se pueden cargar los archivos ");
	    }
	}
	
	@Override
	public String eliminarContenidoCurso(String filename){
	    try {
	        Boolean delete = Files.deleteIfExists(this.imagenesContenidoCurso.resolve(filename));//nombre
	            return "Borrado";
	    }catch (IOException e){
	        e.printStackTrace();
	        return "Error Borrando ";
	    }
	}
	
}
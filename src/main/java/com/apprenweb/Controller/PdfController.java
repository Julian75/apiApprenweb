package com.apprenweb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.apprenweb.Entity.MensajePdf;
import com.apprenweb.Entity.Pdf;
import com.apprenweb.Service.IPdfService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@CrossOrigin("*")
@RequestMapping("api/Pdf")
public class PdfController {
	
	@Autowired
    IPdfService fileService;

//----------------------- Contenido Curso Carpeta - Primera --------------------------------
    
    @PostMapping("/subirContenidoCurso")
	public ResponseEntity<MensajePdf> guardarContenidoCurso(@RequestParam("files") List<MultipartFile> file) throws Exception {
    	fileService.guardarContenidoCursoList(file);
		return ResponseEntity.status(HttpStatus.OK)
				.body(new MensajePdf("Los archivos fueron cargados correctamente al servidor"));
	}

    @GetMapping("/listarTodoContenidoCurso")
    public ResponseEntity<List<Pdf>> listarTodoContenidoCurso(){
        List<Pdf> fileInfos = fileService.listarTodoContenidoCurso().map(path -> {
          String filename = path.getFileName().toString();
          String url = MvcUriComponentsBuilder.fromMethodName(PdfController.class, "listarUnaContenidoCurso",
                  path.getFileName().toString()).build().toString();
          return new Pdf(filename, url);
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(fileInfos);
    }
    
    
    @GetMapping("/listarUnContenidoCurso/{filename:.+}")
    public ResponseEntity<Resource> listarUnaContenidoCurso(@PathVariable String filename){
        Resource file = fileService.listarUnaContenidoCurso(filename);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\""+file.getFilename() + "\"").body(file);
    }

    @GetMapping("/eliminarContenidoCurso/{filename:.+}")
    public ResponseEntity<MensajePdf> eliminarContenidoCurso(@PathVariable String filename) {
        String message = "";
        try {
            message = fileService.eliminarContenidoCurso(filename);
            return ResponseEntity.status(HttpStatus.OK).body(new MensajePdf(message));
        } catch (Exception e) {

            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new MensajePdf(message));
        }
    }
}
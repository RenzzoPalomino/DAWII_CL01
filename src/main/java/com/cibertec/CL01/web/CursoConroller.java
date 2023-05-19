package com.cibertec.CL01.web;

import com.cibertec.CL01.dominio.Curso;
import com.cibertec.CL01.servicio.CursoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Renzzo
 */


@Controller
@Slf4j
public class CursoConroller {
    
    @Autowired
    private CursoService cursoservice;
    
    @RequestMapping("/listadoCursos") 
    public String inicio(Model model){
        
        var cursos = cursoservice.listarCurso();
        
        model.addAttribute("cursos", cursos);
        
        return "index_Cursos";
    }
    
    @GetMapping("/agregarCurso")
    public String agregarCurso(Curso curso){
        return "editar_Curso";
    }
    
    @PostMapping("/guardarCurso")
    public String guardar(Curso curso){
    
        cursoservice.guardarCurso(curso);
        
        return "redirect:/listadoCursos";
    }
    
    @GetMapping("/editarCurso/{id_curso}") 
    public String editarCurso(Curso curso, Model model){
        
       curso= cursoservice.encontrarCurso(curso);
       
       model.addAttribute("curso", curso);
       
       
        return "editar_Curso";
    }
    
    @GetMapping("/eliminarCurso/{id_curso}")
    public String eliminar(Curso curso){
        cursoservice.eliminarCurso(curso);
        return "redirect:/listadoCursos";
        
    }
    
}

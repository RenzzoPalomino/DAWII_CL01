/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.CL01.web;

import com.cibertec.CL01.servicio.AlumnoService;
import com.cibertec.CL01.servicio.CursoService;
import com.cibertec.CL01.dominio.Alumno;
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
public class AlumnoController {
    
    @Autowired
    private AlumnoService alumnoservice;
    @Autowired //para llenar el campo de curso como el nombre del curso
    private CursoService cursoservice;
    
    @GetMapping("/listadoAlumnos")
    public String inicio(Model model){
        
        
          var alumnos = alumnoservice.listarAlumno();
          var cursos = cursoservice.listarCurso();
        
          model.addAttribute("cursos",cursos);
          model.addAttribute("alumnos",alumnos);
        
        return "index_Alumnos";
    } 
    
    
    @GetMapping("/agregar")
    public String agregarAlumno(Alumno alumno, Model model){
            var cursos = cursoservice.listarCurso();
         
          model.addAttribute("cursos",cursos);
        return "editar_Alumno";
    }
    
    @PostMapping("/guardar")
    public String guardar(Alumno x){
    
        alumnoservice.guardarAlumno(x);
        
        return "redirect:/listadoAlumnos";
    }
    
    @GetMapping("/editar/{id_alumno}") 
    public String editarAlumno(Alumno alumno, Model model){
        
       alumno= alumnoservice.encontrarAlumno(alumno);
            var cursos = cursoservice.listarCurso();
        
            model.addAttribute("cursos",cursos);
       
       model.addAttribute("alumno", alumno);
       
       
        return "editar_Alumno";
    }
    
    @GetMapping("/eliminar/{id_alumno}")
    public String eliminar(Alumno alumno){
        alumnoservice.eliminarAlumno(alumno);
        return "redirect:/listadoAlumnos";
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cibertec.CL01.servicio;

import com.cibertec.CL01.dominio.Curso;
import java.util.List;

/**
 *
 * @author Renzzo
 */
public interface CursoService {
    public List<Curso> listarCurso();
    public void guardarCurso(Curso curso);
    
    public void eliminarCurso(Curso curso);
    
    public Curso encontrarCurso(Curso curso);
    
}

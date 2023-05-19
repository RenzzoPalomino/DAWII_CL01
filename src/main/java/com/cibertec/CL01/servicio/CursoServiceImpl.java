/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.CL01.servicio;

import com.cibertec.CL01.dao.CursoDAO;
import com.cibertec.CL01.dominio.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Renzzo
 */
@Service
public class CursoServiceImpl implements CursoService{

    @Autowired
    private CursoDAO cursodao;
    
    @Override 
    public List<Curso> listarCurso() {
        return (List<Curso>)cursodao.findAll();
    }

    @Override
    @Transactional
    public void guardarCurso(Curso curso) {
        cursodao.save(curso);
    }

    @Override
    @Transactional
    public void eliminarCurso(Curso curso) {
        cursodao.delete(curso);
    }

    @Override
    @Transactional(readOnly = true)
    public Curso encontrarCurso(Curso curso) {
        return cursodao.findById(curso.getId_curso()).orElse(null);
    }
    
}

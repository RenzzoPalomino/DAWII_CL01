/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.CL01.servicio;

import com.cibertec.CL01.dao.AlumnoDAO;
import com.cibertec.CL01.dominio.Alumno;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Renzzo
 */
@Service
public class AlumnoServiceImpl implements AlumnoService{

    @Autowired
    private AlumnoDAO alumnodao;
    
    @Override
    public List<Alumno> listarAlumno(){
        return (List<Alumno>)alumnodao.findAll();
    }

    @Override
    @Transactional
    public void guardarAlumno(Alumno alumno) {
         alumnodao.save(alumno);
    }

    @Override
    @Transactional
    public void eliminarAlumno(Alumno alumno) {
            alumnodao.delete(alumno);
        }

    @Override
    @Transactional(readOnly = true)
    public Alumno encontrarAlumno(Alumno alumno) {
        return alumnodao.findById(alumno.getId_alumno()).orElse(null);
    }
    
}

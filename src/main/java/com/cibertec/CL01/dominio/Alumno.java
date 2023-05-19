/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.CL01.dominio;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Renzzo
 */

@Data
@Entity
@Table(name = "Alumno")
public class Alumno {
    
    private static final long serialVersionUID=1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private long id_alumno;
    
    @Column(name = "nombre_alumno")
    private String nombres;
    
    @Column(name = "apellido_alumno")  
    private String apellidos;
    
    @Column(name = "fecha_nacimiento")         
    private /*LocalDate*/ String fechaNacimiento ;
    
    @Column(name = "email_alumno")
    private String email;
     
     
    @ManyToOne   //private int id_Curso;
    @JoinColumn(name = "id_Curso")
    private Curso curso;

    
    
}

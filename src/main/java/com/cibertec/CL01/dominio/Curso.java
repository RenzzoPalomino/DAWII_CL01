/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.CL01.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Renzzo
 */
@Data
@Entity
@Table(name = "Curso")
public class Curso {
    private static final long serialVersionUID=1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_curso;
    
    @Column(name = "nombre_curso")
    private String nombre;
    
    @Column(name = "creditos_curso")
    private int creditos;
    
    @Column(name = "fecha_inicio")
    private String inicio;
    
    @JsonIgnore
    @OneToMany(mappedBy ="curso")
    private List<Alumno> listaAlumnos;
}

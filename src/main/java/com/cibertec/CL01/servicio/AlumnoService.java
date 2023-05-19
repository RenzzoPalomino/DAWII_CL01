
package com.cibertec.CL01.servicio;

import com.cibertec.CL01.dominio.Alumno;
import java.util.List;

/**
 *
 * @author Renzzo
 */

public interface AlumnoService {
    
    public List<Alumno> listarAlumno();
    
    public void guardarAlumno(Alumno alumno);
    
    public void eliminarAlumno(Alumno alumno);
    
    public Alumno encontrarAlumno(Alumno alumno);
    
}

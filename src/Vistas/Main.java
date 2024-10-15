
package Vistas;

import Persistencia.alumnoData;
import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import Persistencia.Conexion;
import Persistencia.inscripcionData;
import Persistencia.materiaData;
import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        
        Conexion conexion = new Conexion();
        
       
        Connection con = conexion.getConexion();
        
        
            if (con != null) {
            System.out.println("¡Conexión exitosa a la base de datos!");

        
            alumnoData data = new alumnoData();

          
            List<Alumno> alumnos = data.obtenerAlumnos();

            
            if (alumnos.isEmpty()) {
                System.out.println("No se encontraron alumnos.");
            } else {
                System.out.println("Lista de alumnos:");
                alumnos.forEach((alumno) -> {
                    System.out.println("ID: " + alumno.getIdAlumno() +
                            ", Nombre: " + alumno.getNombre() +
                            ", Apellido: " + alumno.getApellido() +
                            ", Fecha de Nacimiento: " + alumno.getFechaNac() +
                            ", Activo: " + alumno.isActivo());
                });
            }
        } else {
            System.out.println("No se pudo conectar a la base de datos.");
        }
        
        FlatDarkLaf.setup();
        Principal frame = new Principal();
        frame.setVisible(true);
       
    //probando metodos//
    alumnoData ad=new alumnoData();
    materiaData md=new materiaData();
    inscripcionData id= new inscripcionData();
      
         Alumno Javier=ad.buscarAlumno(7);
         Materia BasesdeDatos=md.buscarMateria(2);
         Inscripcion insc=new Inscripcion(Javier,BasesdeDatos,8);
         id.guardarInscripcion(insc);
         id.actualizarNota(0, 0, 0, 0);
         id.borrarInscripcionMateriaAlumno(7,2 );
         
         for(Inscripcion inscripcion:id.obtenerInscripciones()){
         System.out.println("id"+ inscripcion.getIdInscripcion());
             System.out.println("Apellido" + inscripcion.getAlumno().getApellido());
               System.out.println("Materia"+ inscripcion.getMateria().getNombre());
         }
         
         
         for (Materia materia:id.obtenerMateriasCursadas(2)){
             System.out.println("nombre"+ materia.getNombre());
    
    
    }
}
}
       
       
    




package Vistas;

import Persistencia.alumnoData;
import Modelo.Alumno;
import Persistencia.Conexion;
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
       
    }
}


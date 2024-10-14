
package Vistas;

import Persistencia.alumnoData;
import Modelo.Alumno;
import Persistencia.Conexion;
import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        
        
        FlatDarkLaf.setup();
        Principal frame = new Principal();
        frame.setVisible(true);
       
    }
}


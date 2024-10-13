
package Persistencia;

import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class inscripcionData {
    private Connection con = null;
    private materiaData md;
    private alumnoData ad;

    public inscripcionData() {
        this.con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion insc){
        String sql = "INSERT INTO inscripcion (id_alumno, id_materia, nota, año) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.setInt(4, insc.getAnio());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()){
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"La inscripción se ha realizado correctamente");                
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ocurrió un problema al intentar acceder a la tabla alumno "+ ex.getMessage());
        }

    }
    
    public List<Inscripcion> obtenerInscripciones(){
        List<Inscripcion> insc = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                Inscripcion i = new Inscripcion();
                i.setIdInscripcion(rs.getInt("id_inscripcion"));
                i.setAlumno(ad.buscarAlumno(rs.getInt("id_alumno")));
                i.setMateria(md.buscarMateria(rs.getInt("id_materia")));
                i.setNota(rs.getDouble("nota"));
                i.setAnio(rs.getInt("año"));
                
                insc.add(i);
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ocurrió un problema al intentar acceder a la tabla alumno "+ ex.getMessage());
        }
        return insc;
    
    }
    
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        return null; //CAMBIAR RETURN
    }
    
    public List<Materia> obtenerMateriasCursadas(int id){
        return null; //CAMBIAR RETURN
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int id){
        return null; //CAMBIAR RETURN
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        return null; //CAMBIAR RETURN
    }
}

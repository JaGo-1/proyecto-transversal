
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
    
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        
        String sql="SELECT * FROM inscripcion WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("id_inscripcion"));
                Alumno alu = ad.buscarAlumno(rs.getInt("id_alumno"));
                Materia mat = md.buscarMateria(rs.getInt("id_materia"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
            }
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla inscripción");
        }
        return cursadas; 
    }
    
    public List<Materia> obtenerMateriasCursadas(int idAlumno){
        
        ArrayList <Materia> materias = new ArrayList<>();
        
        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion,"
                + "materia WHERE inscripcion.idMateria = materia.idMateria" +
                "AND inscripcion.idAlumno = ?;";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex){
            
        }
        return materias; 
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int idAlumno){
        ArrayList<Materia> materias = new ArrayList<>();
        
        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in "
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex){
            
        }
        
        return materias; 
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        return null; //CAMBIAR RETURN
    }
}

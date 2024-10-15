
package Persistencia;

import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id_alumno){
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        
        String sql="SELECT * FROM inscripcion WHERE id_alumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_alumno);
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
    
    public List<Materia> obtenerMateriasCursadas(int id_alumno){
        
        ArrayList <Materia> materias = new ArrayList<>();
        
        String sql = "SELECT inscripcion.id_materia, nombre, año FROM inscripcion,"
                + "materia WHERE inscripcion.id_materia = materia.id_materia" +
                "AND inscripcion.id_alumno = ?;";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_alumno);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("id_materia"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "error al cargar la tabla inscripcion");
            ex.printStackTrace();
        }
        return materias; 
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int id_alumno){
        ArrayList<Materia> materias = new ArrayList<>();
        
        String sql = "SELECT * FROM materia WHERE estado = 1 AND id_materia not in "
                + "(SELECT id_materia FROM inscripcion WHERE id_alumno = ?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_alumno);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("id_materia"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex){
            
        }
        
        return materias; 
    }
    
    public void borrarInscripcionMateriaAlumno(int id_alumno, int id_materia){
        try {
            String sql="DELETE FROM inscripcion WHERE id_alumno=? and id_materia=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id_alumno);
            ps.setInt(2, id_materia);
            int filas=ps.executeUpdate();
            if(filas>0){
            JOptionPane.showMessageDialog(null,"inscripcion borradas");
            }
            ps.close();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"error al acceder a la tabla inscripcion  "+ ex.getMessage());
        }
        }
    
        
        
    
    
    public void actualizarNota(int id_alumno, int id_materia, double nota,int año){
        
        
        String sql="UPDATE inscripcion  SET nota = ? WHERE id_alumno = ? and id_materia";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, id_alumno);
            ps.setInt(3, id_materia);
            ps.setInt(4, año);
            int filas=ps.executeUpdate();
            if(filas>0){
            JOptionPane.showMessageDialog(null,"nota actualizada");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Ocurrió un problema al intentar acceder a la tabla inscripcion "+ ex.getMessage());
        }
        
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int id_materia){
        ArrayList<Alumno> alumnosMateria=new ArrayList<>();
        String sql="SELECT a.id_alumno,dni,nombre.apellido,fechaNacimiento,estado"
                        + "FROM inscripcion i , alumno a WHERE i.id_alumno = a.id_alumno AND id_materia = ? AND a.estado = 1";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id_materia);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                
            Alumno alumno=new Alumno ();
            alumno.setIdAlumno(rs.getInt("id_alumno"));
            alumno.setApellido(rs.getString("apellido"));
            alumno.setNombre(rs.getString("nombre"));
            alumno.setDni(rs.getInt("dni"));
            alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
            alumno.setActivo(rs.getBoolean("1"));
            
             alumnosMateria.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla");
        }
        
        
        return alumnosMateria; 
    
    }
}


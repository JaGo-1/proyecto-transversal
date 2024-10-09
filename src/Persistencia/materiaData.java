
package Persistencia;

import Modelo.Materia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class materiaData {
    private Connection con = null;
    


   public materiaData(){

 con=Conexion.getConexion();
         }
public void guardarMateria(Materia materia){
    
        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1)); 
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al guardar la materia: " + ex.getMessage());
        }
    }

    public Materia buscarMateria(int id) {
    Materia materia = null; 
    try {
        String sql = "SELECT * FROM materia WHERE id_materia = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            materia = new Materia();
            materia.setIdMateria(rs.getInt("id_materia"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnioMateria(rs.getInt("año"));
            materia.setActivo(rs.getBoolean("estado"));
        }
        ps.close();
    } catch (SQLException ex) {
        System.out.println("Error al obtener la materia: " + ex.getMessage());
    }
    return materia;
    

    }

    public void actualizarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE id_materia = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar materia: " + ex.getMessage());
        }
    }

    public void eliminarMateria(int id_materia) {
        String sql = "DELETE FROM materia WHERE id_materia = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_materia);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar la materia: " + ex.getMessage());
        }
        
    }
    public List<Materia> listarMaterias() {
    List<Materia> materias = new ArrayList<>();
    try {
        String sql = "SELECT * FROM materia";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Materia materia = new Materia();
            materia.setIdMateria(rs.getInt("id_materia"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnioMateria(rs.getInt("año"));
            materia.setActivo(rs.getBoolean("estado"));
            materias.add(materia);
        }
        ps.close();
    } catch (SQLException ex) {
        System.out.println("Error al obtener materias: " + ex.getMessage());
    }
    return materias;
}
}








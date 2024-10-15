package Persistencia;

import Modelo.Alumno;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class alumnoData {

    private Connection con = null;

    public alumnoData() {

        con = Conexion.getConexion();

    }

    public void guardarAlumno(Alumno alumno) {

        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, java.sql.Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al guardar el alumno: " + ex.getMessage());
        }
    }

    public List<Alumno> obtenerAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("id_alumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener alumnos: " + ex.getMessage());
        }
        return alumnos;
    }

    public Alumno buscarAlumno(int id) {
        Alumno a = new Alumno();
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE id_alumno = ? AND estado = 1";
  //      PreparedStatement ps = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                a.setIdAlumno(id);
                a.setDni(rs.getInt("dni"));
                a.setApellido(rs.getString("apellido"));
                a.setNombre(rs.getString("nombre"));
                a.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                a.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al intentar acceder a la tabla alumno " + ex.getMessage());
        }
        return a;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno a = null;
        String sql = "SELECT id_alumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                a = new Alumno();
                a.setIdAlumno(rs.getInt("id_alumno"));
                a.setDni(rs.getInt("dni"));
                a.setApellido(rs.getString("apellido"));
                a.setNombre(rs.getString("nombre"));
                a.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                a.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al intentar acceder a la tabla alumno " + ex.getMessage());
        }

        return a;
    }

    public void modificarAlumno(Alumno a) {
        String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ? WHERE id_alumno = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, a.getDni());
            ps.setString(2, a.getApellido());
            ps.setString(3, a.getNombre());
            ps.setDate(4, Date.valueOf(a.getFechaNac()));
            ps.setInt(5, a.getIdAlumno());

            int result = ps.executeUpdate();

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Se ha modificado el alumno");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar acceder a la tabla alumno " + ex.getMessage());
        }

    }

    public void bajaLogicaAlumno(int id) {
    String sql = "UPDATE alumno SET estado = 0 WHERE id_alumno = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, id);
        int f = ps.executeUpdate();
        if (f == 1) {
            JOptionPane.showMessageDialog(null, "Se eliminó el alumno");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el alumno");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar acceder a la tabla alumno: " + ex.getMessage());
    }
}


    public void bajaFisicaAlumno(int id) {
        try {
            String sql = "DELETE FROM alumno WHERE id_alumno = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int f = ps.executeUpdate();
            if (f == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar acceder a la tabla alumno " + ex.getMessage());
        }
    }
}


package Modelo;


public class Inscripcion {
    
    int idInscripcion;
    Alumno alumno;
    Materia materia;
    double nota;
    int anio;

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, double nota, int anio) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
        this.anio = anio;
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota, int anio) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
        this.anio = anio;
    }

    public Inscripcion() {
    }

    public Inscripcion(double nota) {
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
}

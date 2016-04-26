package maxaub.ejb.interfaz;

import java.util.List;

import javax.ejb.Local;

import maxaub.model.Alumno;

@Local
public interface AlumnoDAO {
    public List<Alumno> getAlumnos();
    public Alumno getAlumno(int numAlumno);
    public void guardarAlumno(Alumno alumno);
    public void eliminarAlumno(Alumno alumno);
}

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Estudiante extends Persona {

    /**
     * Default constructor
     */
    public Estudiante() {
    }

    /**
     * 
     */
    private String codigo_estudiante;

    /**
     * 
     */
    private Carrera codigo_carrera;

    /**
     * 
     */
    private int semestre;

    /**
     * @return
     */
    public String getCodigoEstudiante() {
        // TODO implement here
        return "";
    }

    /**
     * @param codigo_estudiante 
     * @return
     */
    public void setCodigoEstudiante(String codigo_estudiante) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Carrera getCodigoCarrera() {
        // TODO implement here
        return null;
    }

    /**
     * @param codigo_carrera 
     * @return
     */
    public void setCodigoCarrera(Carrera codigo_carrera) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getSemestre() {
        // TODO implement here
        return 0;
    }

    /**
     * @param semestre 
     * @return
     */
    public void setSemestre(int semestre) {
        // TODO implement here
        return null;
    }

    /**
     * @param curso 
     * @return
     */
    public void inscribirseCurso(Curso curso) {
        // TODO implement here
        return null;
    }

    /**
     * @param curso 
     * @return
     */
    public void cancelarInscripcion(Curso curso) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public HistorialAcademico consultarHistorialAcademico() {
        // TODO implement here
        return null;
    }

    /**
     * @param curso 
     * @return
     */
    public boolean validarPrerrequisitos(Curso curso) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public List<Curso> generarReporteCursosAprobados() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Curso> generarReporteCursosEnProceso() {
        // TODO implement here
        return null;
    }

}
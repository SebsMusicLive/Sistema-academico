
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Docente extends Persona {

    /**
     * Default constructor
     */
    public Docente() {
    }

    /**
     * 
     */
    private String codigo_docente;

    /**
     * 
     */
    private Departamento codigo_departamento;

    /**
     * 
     */
    private String titulo;

    /**
     * 
     */
    private String especializacion;

    /**
     * 
     */
    private int carga_horaria;

    /**
     * @return
     */
    public String getCodigoDocente() {
        // TODO implement here
        return "";
    }

    /**
     * @param codigo_docente 
     * @return
     */
    public void setCodigoDocente(String codigo_docente) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Departamento getCodigoDepartamento() {
        // TODO implement here
        return null;
    }

    /**
     * @param codigo_departamento 
     * @return
     */
    public void setCodigoDepartamento(Departamento codigo_departamento) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getTitulo() {
        // TODO implement here
        return "";
    }

    /**
     * @param titulo 
     * @return
     */
    public void setTitulo(String titulo) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getEspecializacion() {
        // TODO implement here
        return "";
    }

    /**
     * @param especializacion 
     * @return
     */
    public void setEspecializacion(String especializacion) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getCargaHoraria() {
        // TODO implement here
        return 0;
    }

    /**
     * @param carga_horaria 
     * @return
     */
    public void setCargaHoraria(int carga_horaria) {
        // TODO implement here
        return null;
    }

    /**
     * @param curso 
     * @return
     */
    public void asignarCurso(Curso curso) {
        // TODO implement here
        return null;
    }

    /**
     * @param curso 
     * @return
     */
    public void generarEvaluacion(Curso curso) {
        // TODO implement here
        return null;
    }

    /**
     * @param estudiante 
     * @param evaluacion 
     * @param nota 
     * @return
     */
    public void registrarCalificacion(Estudiante estudiante, Evaluacion evaluacion, float nota) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public boolean validarDisponibilidad() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public List<Curso> generarReporteCursosAsignados() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Evaluacion> HistorialEvaluaciones() {
        // TODO implement here
        return null;
    }

}
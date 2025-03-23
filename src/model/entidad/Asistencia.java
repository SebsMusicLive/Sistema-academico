package entidad;
import java.util.*;

/**
 * 
 */
public class Asistencia {

    /**
     * Default constructor
     */
    public Asistencia() {
    }

    /**
     * 
     */
    private String codigo_asistencia;

    /**
     * 
     */
    private Estudiante codigo_estudiante;

    /**
     * 
     */
    private Curso codigo_curso;

    /**
     * 
     */
    private Date fecha;

    /**
     * 
     */
    private boolean presente;

    /**
     * @return
     */
    public String getCodigo_asistencia() {
        // TODO implement here
        return this.codigo_asistencia;
    }

    /**
     * @param codigo_asistencia 
     * @return
     */
    public void setCodigo_asistencia(String codigo_asistencia) {    
        // TODO implement here
        this.codigo_asistencia = codigo_asistencia;
    }

    /**
     * @return
     */
    public Estudiante getCodigoEstudiante() {
        // TODO implement here
        return this.codigo_estudiante;
    }

    /**
     * @param codigo_estudiante 
     * @return
     */
    public void setCodigoEstudiante(Estudiante codigo_estudiante) {
        // TODO implement here
        this.codigo_estudiante = codigo_estudiante;
    }

    /**
     * @return
     */
    public Curso getCodigoCurso() {
        // TODO implement here
        return this.codigo_curso;
    }

    /**
     * @param codigo_curso 
     * @return
     */
    public void setCodigoCurso(Curso codigo_curso) {
        // TODO implement here
        this.codigo_curso = codigo_curso;
    }

    /**
     * @return
     */
    public Date getFecha() {
        // TODO implement here
        return this.fecha;
    }

    /**
     * @param fecha 
     * @return
     */
    public void setFecha(Date fecha) {
        // TODO implement here
        this.fecha = fecha;
    }

    /**
     * @return
     */
    public boolean isPresente() {
        // TODO implement here
        return this.presente;
    }

    /**
     * @param presente 
     * @return
     */
    public void setPresente(boolean presente) {
        // TODO implement here
        this.presente = presente;
    }

    /**
     * @return
     */
    public void registrarAsistencia() {
        // TODO implement here
        this.presente = true;
        this.fecha = new Date(); //Se registra la fecha actual
        System.out.println("Asistencia registrada: "+codigo_asistencia);
        
    }

    /**
     * @return
     */
    public void justificarInasistencias() {
        // TODO implement here
        if(!this.presente){
            this.presente = true;
            this.fecha = new Date(); //Se registra la fecha actual
            System.out.println("Inasistencia justificada: "+codigo_asistencia);
        }else{
            System.out.println("El estudiante ya estaba presente.");
        }
    }

    /**
     * @return
     */
    public String generarReporteInasistencias() {
        // TODO implement here
        if(this.presente){
            return "El estudiante " + this.codigo_estudiante.getNombre() + " estuvo presente en el curso " + this.codigo_curso.getNombre() + " el " + this.fecha;
        }
        else{
            return "El estudiante " + this.codigo_estudiante.getNombre() + " no estuvo presente en el curso " + this.codigo_curso.getNombre() + " el " + this.fecha;
        }
    }

}
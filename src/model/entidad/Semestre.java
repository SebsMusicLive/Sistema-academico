
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Semestre {

    /**
     * Default constructor
     */
    public Semestre() {
    }

    /**
     * 
     */
    private String codigo_semestre;

    /**
     * 
     */
    private int numero;

    /**
     * 
     */
    private Date fecha_inicio;

    /**
     * 
     */
    private Date fecha_fin;

    /**
     * @return
     */
    public String getCodigoSemestre() {
        // TODO implement here
        return this.codigo_semestre;
    }

    /**
     * @param codigo_semestre 
     * @return
     */
    public void setCodigoSemestre(String codigo_semestre) {
        // TODO implement here
        this.codigo_semestre = codigo_semestre;
    }

    /**
     * @return
     */
    public int getNumero() {
        // TODO implement here
        return this.numero;
    }

    /**
     * @param numero 
     * @return
     */
    public void setNumero(int numero) {
        // TODO implement here
        this.numero = numero;
    }

    /**
     * @return
     */
    public Date getFechaInicio() {
        // TODO implement here
        return this.fecha_inicio;
    }

    /**
     * @param fecha_inicio 
     * @return
     */
    public void setFechaInicio(Date fecha_inicio) {
        // TODO implement here
        this.fecha_inicio = fecha_inicio;
    }

    /**
     * @return
     */
    public Date getFechaFin() {
        // TODO implement here
        return this.fecha_fin;
    }

    /**
     * @param fecha_fin 
     * @return
     */
    public void setFechaFin(Date fecha_fin) {
        // TODO implement here
        this.fecha_fin = fecha_fin;
    }

    /**
     * @param fecha_inicio 
     * @param fecha_fin 
     * @return
     */
    public void definirFechasInicioFin(Date fecha_inicio, Date fecha_fin) {
        // TODO implement here
        if (fecha_inicio == null || fecha_fin == null) {
            System.out.println("Las fechas no pueden ser nulas.");
            return;
        }
        
        if (fecha_inicio.after(fecha_fin)) {
            System.out.println("Error: La fecha de inicio no puede ser posterior a la fecha de fin.");
            return;
        }

        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        System.out.println("Fechas del semestre definidas: Inicio " + fecha_inicio + ", Fin " + fecha_fin);
    }

    /**
     * @return
     */
    public void cerrarSemestre() {
        // TODO implement here
        Date fechaActual = new Date();

        if (this.fecha_fin != null && fechaActual.after(this.fecha_fin)) {
            System.out.println("El semestre ya ha finalizado anteriormente.");
            return;
        }

        this.fecha_fin = fechaActual;
        System.out.println("El semestre ha sido cerrado en la fecha: " + this.fecha_fin);
        
    }

    /**
     * @return
     */
    public String generarCalendarioAcademico() {
        // TODO implement here
        if (this.fecha_inicio == null || this.fecha_fin == null) {
            return "No se han definido las fechas del semestre.";
        }

        return "Calendario Académico:\n" +
               "Código del Semestre: " + this.codigo_semestre + "\n" +
               "Número de Semestre: " + this.numero + "\n" +
               "Fecha de Inicio: " + this.fecha_inicio + "\n" +
               "Fecha de Fin: " + this.fecha_fin;
    }

}
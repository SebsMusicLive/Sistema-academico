package entidad;

import java.io.*;
import java.util.*;

/**
 * 
 */
 private String codigo_recursoAcademico;
    private String titulo;
    private String tipo;
    private Curso codigo_curso;
    private String nombre;
    private boolean disponibilidad;
    private String ubicacion;
    private String tipo_espacio;

    public RecursoAcademico() {
    }

    public String getCodigo_recursoAcademico() {
        return codigo_recursoAcademico;
    }

    public void setCodigo_recursoAcademico(String codigo_recursoAcademico) {
        this.codigo_recursoAcademico = codigo_recursoAcademico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Curso getCodigoCurso() {
        return codigo_curso;
    }

    public void setCodigoCurso(Curso codigo_curso) {
        this.codigo_curso = codigo_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoEspacio() {
        return tipo_espacio;
    }

    public void setTipoEspacio(String tipo_espacio) {
        this.tipo_espacio = tipo_espacio;
    }

    public void agregarRecurso() {
        System.out.println("Recurso agregado exitosamente.");
    }

    public void eliminarRecurso() {
        System.out.println("Recurso eliminado exitosamente.");
    }

    public void reservarRecurso(Date fecha, String hora) {
        if (disponibilidad) {
            disponibilidad = false;
            System.out.println("Recurso reservado para el " + fecha + " a las " + hora);
        } else {
            System.out.println("El recurso no está disponible para reserva.");
        }
    }

    public boolean verificarDisponibilidad() {
        return disponibilidad;
    }

    public void gestionarMantenimiento() {
        System.out.println("El recurso está en mantenimiento.");
        disponibilidad = false;
    }

}
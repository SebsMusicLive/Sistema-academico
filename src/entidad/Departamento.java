package entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Departamento {

    private String codigoDepartamento;
    private String nombre;
    private Facultad facultad;
    private List<Docente> docentes;

    // Constructor vacío
    public Departamento() {
        this.docentes = new ArrayList<>();
    }

    // Constructor con parámetros
    public Departamento(String codigoDepartamento, String nombre, Facultad facultad) {
        this.codigoDepartamento = codigoDepartamento;
        this.nombre = nombre;
        this.facultad = facultad;
        this.docentes = new ArrayList<>();
    }

    // Getters y Setters
    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    // Métodos de gestión del departamento
    public void agregarDepartamento() {
        System.out.println("Departamento '" + nombre + "' agregado correctamente.");
    }

    public void modificarDepartamento(String nuevoNombre, Facultad nuevaFacultad) {
        this.nombre = nuevoNombre;
        this.facultad = nuevaFacultad;
        System.out.println("Departamento actualizado: " + nombre);
    }

    public void eliminarDepartamento() {
        System.out.println("Departamento '" + nombre + "' eliminado.");
    }

    public void asignarDocente(Docente docente) {
        if (!docentes.contains(docente)) {
            docentes.add(docente);
            System.out.println("Docente " + docente.getNombre() + " asignado al departamento " + nombre);
        } else {
            System.out.println("El docente ya pertenece a este departamento.");
        }
    }

    public void listarDocentes() {
        System.out.println("Docentes en el departamento " + nombre + ":");
        if (docentes.isEmpty()) {
            System.out.println("No hay docentes asignados.");
        } else {
            for (Docente docente : docentes) {
                System.out.println("- " + docente.getNombre());
            }
        }
    }
}